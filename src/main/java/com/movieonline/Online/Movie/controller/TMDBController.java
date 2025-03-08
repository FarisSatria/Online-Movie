package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserBookingEntity;
import com.movieonline.Online.Movie.exception.MovieBookingConflictException;
import com.movieonline.Online.Movie.repository.FeedBackRepository;
import com.movieonline.Online.Movie.repository.UserRepository;
import com.movieonline.Online.Movie.security.util.AuthenticationUtils;
import com.movieonline.Online.Movie.service.TMDBService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Controller
public class TMDBController {

    private final FeedBackRepository feedBackRepository;
    private final UserRepository userRepository;
    private final TMDBService tmdbService;
    private final AuthenticationUtils authenticationUtils;
    private final UserController userController;

    public TMDBController(FeedBackRepository feedBackRepository, TMDBService tmdbService, AuthenticationUtils authenticationUtils, UserRepository userRepository, UserController userController) {
        this.feedBackRepository = feedBackRepository;
        this.tmdbService = tmdbService;
        this.authenticationUtils = authenticationUtils;
        this.userRepository = userRepository;
        this.userController = userController;
    }

    public Model pageDetails(Model model){
        model.addAttribute("WebName", "Cinema Eudamonia");
        return model;
    }

    public Model getAllMovies(Model model){
        List<MovieDTO> getAllMovies = tmdbService.getAllMovies(1);
        model.addAttribute("getAllMovies", getAllMovies);

        return model;
    }

    @GetMapping("/dashboard/booking/{pageNumber}")
    public String changeNumberPages(@PathVariable Integer pageNumber, RedirectAttributes redirectAttributes){
        List<MovieDTO> getMoviesPage = tmdbService.getAllMovies(pageNumber);
        redirectAttributes.addFlashAttribute("getMoviesPage", getMoviesPage);
        redirectAttributes.addFlashAttribute("getPreviousNumberPages", pageNumber);

        return "redirect:/dashboard/booking";
    }

    public Model getMovieDetails(@PathVariable Long id, Model model){
        // All Specific Movie Details
        MovieDTO movieDetail = tmdbService.getMovie(id);
        model.addAttribute("movieDetail", movieDetail);

        // Specific Movie Miscellaneous
        List<MovieCastDTO> movieCast = tmdbService.getMovieCast(id);
        model.addAttribute("movieCast", movieCast);

        List<MovieDTO> movieRecommendation = tmdbService.getMovieRecommendation(id);
        model.addAttribute("movieRecommendation", movieRecommendation);

        List<MovieReviewsDTO> movieReviews = tmdbService.getMovieReviews(id);
        model.addAttribute("movieReviews", movieReviews);

        List<MovieKeywordsDTO> movieKeywords = tmdbService.getMovieKeywords(id);
        model.addAttribute("movieKeywords", movieKeywords);

        List<FeedBackEntity> movieFeedbacks = tmdbService.getFeedback();
        model.addAttribute("movieFeedbacks", movieFeedbacks);

        return model;
    }

    public Model getMoviesDetails(Model model){
        //Popular Movie
        List<MovieDTO> popularMovies = tmdbService.getPopularMovies();
        model.addAttribute("popularMovies", popularMovies);

        //Top Rated Movie
        List<MovieDTO> topRatedMovies = tmdbService.getTopRatedMovies();
        model.addAttribute("topRatedMovies", topRatedMovies);

        //Upcoming Movie
        List<MovieDTO> upcomingMovies = tmdbService.getUpcomingMovies();
        model.addAttribute("upcomingMovies", upcomingMovies);

        //Now Playing Movies
        List<MovieDTO> nowPlayingMovies = tmdbService.getNowPlayingMovies();
        model.addAttribute("nowPlayingMovies", nowPlayingMovies);

        return model;
    }

    @GetMapping("/api/search/movies")
    public String searchMovies(@RequestParam String name, Principal principal,
                               RedirectAttributes redirectAttributes) {

        List<MovieDTO> searchMovies = tmdbService.searchMovies(name);
        redirectAttributes.addFlashAttribute("searchMovies", searchMovies);
        redirectAttributes.addFlashAttribute("searchMoviesPlaceholder", name);

        if(principal == null){
            return "redirect:/movies/search";
        }else{
            if (!userRepository.findIsAdminTrueByUsername(authenticationUtils.getUsername())){
                return "redirect:/movies/search";
            }else{
                return "redirect:/dashboard/booking";
            }
        }
    }


    @PostMapping("/movie/{id}/feedback")
    public String provideFeedback(@PathVariable Long id,
                                  @RequestParam(required = false) String reviews,
                                  @RequestParam Integer rating,
                                  FeedBackEntity feedBackEntity) {

        tmdbService.provideFeedback(feedBackEntity, authenticationUtils.getUsername(), id, reviews, rating);

        return "redirect:/movie/" + id;
    }

    @PutMapping("/movie/{id}/feedback")
    public String updateFeedback(@PathVariable Long id,
                                 @RequestParam(required = false) String reviews,
                                 @RequestParam(required = false) Integer rating){

        String username = authenticationUtils.getUsername();

        if(rating == null){
            tmdbService.updateFeedback(id, username, reviews, feedBackRepository.findRatingByUsernameAndMovieIdAAndIsDeletedFalse(username, id).get());
        }else{
            tmdbService.updateFeedback(id, authenticationUtils.getUsername(), reviews, rating);
        }

        return "redirect:/movie/" + id;
    }

    @GetMapping("/movie/{id}/feedback/delete")
    public String deleteFeedback(@PathVariable Long id){
        tmdbService.deleteFeedback(id, authenticationUtils.getUsername());

        return "redirect:/movie/" + id;
    }


    @PostMapping("/movie/{id}/booking")
    public String submitBooking(@PathVariable Long id,
                                 @RequestParam("custom-date") LocalDate bookedDate,
                                 @RequestParam("custom-time") LocalTime bookedTime,
                                RedirectAttributes redirectAttributes){
        try{
            tmdbService.submitBooking(id, authenticationUtils.getUsername(), bookedDate, bookedTime);
            redirectAttributes.addFlashAttribute("movieHasBeenBooked", "Movie has been booked successfully!");
        } catch (MovieBookingConflictException e) {
            redirectAttributes.addFlashAttribute("movieBookingConflict", e.getMessage());
        }

        return "redirect:/movie/" + id;
    }

    @GetMapping("/movie/{id}/booking/cancel")
    public String cancelBooking(@PathVariable Long id, RedirectAttributes redirectAttributes){
        tmdbService.cancelBooking(id, authenticationUtils.getUsername());
        redirectAttributes.addFlashAttribute("bookingHasBeenCanceled", "Booking has been canceled successfully!");

        return "redirect:/booking";
    }

    @GetMapping("/movie/{id}/check-quota")
    @ResponseBody
    public Map<String, Integer> checkQuota(@PathVariable Long id, @RequestParam LocalDate date, @RequestParam LocalTime time) {
        int availableQuota = tmdbService.getAvailableQuota(id, date, time);
        return Map.of("availableQuota", availableQuota);
    }


    @GetMapping("/movie/{id}/booking/enable")
    public String enableMovieBooking(@PathVariable Long id,
                                     RedirectAttributes redirectAttributes){
        tmdbService.enableMovieBooking(id);
        redirectAttributes.addFlashAttribute("movieHasBeenEnabled","Movie has been enabled successfully!");

        return "redirect:/dashboard/booking";
    }

    @GetMapping("/movie/{id}/booking/disable")
    public String disableMovieBooking(@PathVariable Long id, RedirectAttributes redirectAttributes){
        tmdbService.disableMovieBooking(id);
        redirectAttributes.addFlashAttribute("movieHasBeenDisabled", "Movie has been disabled successfully!");

        return "redirect:/dashboard/booking";
    }

}

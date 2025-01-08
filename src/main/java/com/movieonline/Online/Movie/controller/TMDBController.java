package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.repository.FeedBackRepository;
import com.movieonline.Online.Movie.security.util.AuthenticationUtils;
import com.movieonline.Online.Movie.service.TMDBService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TMDBController {

    private final FeedBackRepository feedBackRepository;
    private final TMDBService tmdbService;
    private final AuthenticationUtils authenticationUtils;

    public TMDBController(FeedBackRepository feedBackRepository, TMDBService tmdbService, AuthenticationUtils authenticationUtils, List<FeedBackEntity> movieFeedbacks) {
        this.feedBackRepository = feedBackRepository;
        this.tmdbService = tmdbService;
        this.authenticationUtils = authenticationUtils;
    }

    public Model pageDetails(Model model){
        model.addAttribute("WebName", "Cinema Eudamonia");
        return model;
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
    @ResponseBody
    public List<MovieDTO> searchMovies(@RequestParam String name) {
        return tmdbService.searchMovies(name);
    }


    @PostMapping("/movie/{id}/feedback")
    public String provideFeedback(@PathVariable Long id,
                                  @RequestParam(required = false) String reviews,
                                  @RequestParam Integer rating,
                                  FeedBackEntity feedBackEntity) {

        tmdbService.provideFeedback(feedBackEntity, authenticationUtils.getUsername(), id, reviews, rating);

        return "redirect:/movie/" + id;
    }

    @PostMapping("/movie/{id}/booking")
    public String submitBooking(
            @PathVariable("id") Long movieId,
            @RequestParam("custom-date") String date,
            @RequestParam("custom-time") String time,
            Model model) {

        try {
            Date bookingDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            Time bookingTime = Time.valueOf(time + ":00");

            MovieBookingEntity movieBookingEntity = new MovieBookingEntity();
            movieBookingEntity.setMovieId(movieId);
            if (movieBookingEntity.getUsername() == null) {
                movieBookingEntity.setUsername(new ArrayList<>());
            }
            movieBookingEntity.getUsername().add(authenticationUtils.getUsername());
            movieBookingEntity.setDate(bookingDate);
            movieBookingEntity.setTime(bookingTime);

            tmdbService.addBooking(movieBookingEntity, authenticationUtils.getUsername(), movieId);

            // Pass success message to the model
            model.addAttribute("successMessage", "Your booking was successful!");
        } catch (ParseException e) {
            model.addAttribute("errorMessage", "Invalid date or time format.");
            e.printStackTrace();
        } catch (RuntimeException e) {
            model.addAttribute("errorMessage", e.getMessage());
            e.printStackTrace();
        }

        return "redirect:/movie/" + movieId;
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
}

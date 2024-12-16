package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import com.movieonline.Online.Movie.service.TMDBService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@AllArgsConstructor
@Controller
public class TMDBController {

    private final TMDBService tmdbService;
    private final GuestSessionController guestSessionController;

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

    @PostMapping("/movie/{id}/feedback")
    public String provideFeedback(@PathVariable long id,
                                  @RequestParam(required = false) Double rating,
                                  @RequestParam(required = false) String review,
                                  String guestSessionId,
                                  Model model) {
        if (rating != null && (rating < 0.5 || rating > 5.0)) {
            throw new IllegalArgumentException("Rating must be between 0.5 and 5.0.");
        }

        if (guestSessionId == null || guestSessionId.isEmpty()) {
            guestSessionId = guestSessionController.getGuestSessionId();
        }

        System.out.println("Received rating: " + rating);
        System.out.println("Received review: " + review);
        System.out.println("Received guestSessionId: " + guestSessionId);


        tmdbService.provideFeedback(id, rating, review, guestSessionId);
        getMovieDetails(id, model);
        getMoviesDetails(model);
        pageDetails(model);
        return "movie-page";
    }

}

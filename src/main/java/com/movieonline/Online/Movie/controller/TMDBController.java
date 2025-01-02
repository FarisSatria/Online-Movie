package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.security.util.AuthenticationUtils;
import com.movieonline.Online.Movie.service.TMDBService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
public class TMDBController {

    private final TMDBService tmdbService;
    private final AuthenticationUtils authenticationUtils;

    public TMDBController(TMDBService tmdbService, AuthenticationUtils authenticationUtils) {
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

    public Model getMiscellaneous(Model model){
        //User List
        List<UserEntity> userList = tmdbService.getUser();
        model.addAttribute("userList", userList);

        return model;
    }

    @GetMapping("/api/search")
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

    @PutMapping("/movie/{id}/feedback")
    public String updateFeedback(@PathVariable Long id,
                                 @RequestParam String reviews,
                                 @RequestParam Integer rating){
        System.out.println(rating);

        tmdbService.updateFeedback(id, authenticationUtils.getUsername(), reviews, rating);

        return "redirect:/movie/" + id;
    }

    @GetMapping("/movie/{id}/feedback/delete")
    public String deleteFeedback(@PathVariable Long id){
        tmdbService.deleteFeedback(id, authenticationUtils.getUsername());

        return "redirect:/movie/" + id;
    }
}

package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.service.TMDBService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@AllArgsConstructor
@Controller
public class TMDBController {

    private final TMDBService tmdbService;

    public Model getMovieDetails(@PathVariable Long id, Model model){
        // All Specific Movie Details
        MovieDTO movieDetail = tmdbService.getMovie(id);
        model.addAttribute("movieDetail", movieDetail);

        // Specific Movie Miscellaneous
        List<MovieCastDTO> movieCast = tmdbService.getMovieCast(id);
        model.addAttribute("movieCast", movieCast);

        System.out.println("Movie Cast :" + movieCast);
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

        return model;
    }
}

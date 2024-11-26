package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.service.TMDBService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@AllArgsConstructor
@Controller
public class TMDBController {

    private final TMDBService tmdbService;

    public Model movieDetails(Model model){
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

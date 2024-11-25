package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.service.LoginService;
import com.movieonline.Online.Movie.service.TMDBService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class TemplateController {

    private final LoginService loginService;
    private final TMDBService tmdbService;

    public Model pageDetails(Model model){
        model.addAttribute("WebName", "Cinema Eudamonia");
        return model;
    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        //Popular Movie
        List<MovieDTO> popularMovies = tmdbService.getPopularMovies();
        model.addAttribute("popularMovies", popularMovies);

        //Top Rated Movie
        List<MovieDTO> topRatedMovies = tmdbService.getTopRatedMovies();
        model.addAttribute("topRatedMovies", topRatedMovies);

        //Upcoming Movie
        List<MovieDTO> upcomingMovies = tmdbService.getUpcomingMovies();
        model.addAttribute("upcomingMovies", upcomingMovies);

        pageDetails(model);
        return "index";
    }

    @GetMapping("/movie/**")
    public String moviePage(Model model){
        pageDetails(model);
        return "movie-page";
    }

}

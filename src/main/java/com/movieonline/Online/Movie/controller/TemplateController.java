package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.exception.GlobalExceptionHandler;
import com.movieonline.Online.Movie.service.LoginService;
import com.movieonline.Online.Movie.service.TMDBService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class TemplateController {

    private final LoginService loginService;
    private final TMDBController tmdbController;

    public Model pageDetails(Model model){
        model.addAttribute("WebName", "Cinema Eudamonia");
        return model;
    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        tmdbController.getMoviesDetails(model);
        pageDetails(model);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String moviePage(@PathVariable(required = true) Long id, Model model){
        tmdbController.getMovieDetails(id, model);
        tmdbController.getMoviesDetails(model);
        pageDetails(model);
        return "movie-page";
    }
}

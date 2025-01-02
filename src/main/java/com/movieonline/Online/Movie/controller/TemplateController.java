package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.security.util.AuthenticationUtils;
import com.movieonline.Online.Movie.service.TMDBService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;
import java.util.Optional;

@Controller
public class TemplateController {

    private final TMDBController tmdbController;
    private final AuthenticationUtils authenticationUtils;
    private final TMDBService tmdbService;

    public TemplateController(TMDBController tmdbController, AuthenticationUtils authenticationUtils, TMDBService tmdbService) {
        this.tmdbController = tmdbController;
        this.authenticationUtils = authenticationUtils;
        this.tmdbService = tmdbService;
    }

    public Model pageDetails(Model model){
        model.addAttribute("WebName", "Cinema Eudamonia");

        return model;
    }

    public Model matchingFeedbacks(@PathVariable Long id, Model model){
        Optional<FeedBackEntity> matchingFeedback = tmdbService.getFeedback().stream()
                .filter(f -> f.getUsername().equals(authenticationUtils.getUsername()) && f.getMovieId().equals(tmdbService.getMovie(id).getId()) && f.getIsDeleted() == false)
                .findFirst();

        return model.addAttribute("matchingFeedback", matchingFeedback);
    }

    @GetMapping("/")
    public String showHomePage(Principal principal, Model model) {
        tmdbController.getMoviesDetails(model);
        authenticationUtils.isLoggedIn(principal, model);
        tmdbController.getMiscellaneous(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String moviePage(@PathVariable(required = true) Long id, Principal principal, Model model){
        tmdbController.getMovieDetails(id, model);
        tmdbController.getMoviesDetails(model);
        tmdbController.getMiscellaneous(model);
        authenticationUtils.isLoggedIn(principal, model);
        matchingFeedbacks(id, model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "movie-page";
    }
}

package com.movieonline.Online.Movie.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;

@Controller
public class TemplateController {

    private final TMDBController tmdbController;

    public TemplateController(TMDBController tmdbController) {
        this.tmdbController = tmdbController;
    }

    public Model pageDetails(Model model){
        model.addAttribute("WebName", "Cinema Eudamonia");

        return model;
    }

    public Model isLoggedIn(Principal principal, Model model){
        boolean isLoggedIn = (principal != null);

        model.addAttribute("isLoggedIn", isLoggedIn);
        if (isLoggedIn) {
            model.addAttribute("username", principal.getName());
        }

        return model;
    }

    public Model getUsername(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Object principal = authentication.getPrincipal();
        String username = null;

        if (principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;
            username = userDetails.getUsername();
        } else if (principal instanceof String) {
            username = (String) principal;
        }

        model.addAttribute("getUsername", username);

        return model;
    }

    @GetMapping("/")
    public String showHomePage(Principal principal, Model model) {
        tmdbController.getMoviesDetails(model);
        isLoggedIn(principal, model);
        getUsername(model);
        pageDetails(model);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String moviePage(@PathVariable(required = true) Long id, Principal principal, Model model){
        tmdbController.getMovieDetails(id, model);
        tmdbController.getMoviesDetails(model);
        isLoggedIn(principal, model);
        getUsername(model);
        pageDetails(model);
        return "movie-page";
    }
}

package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.service.LoginService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class TemplateController {

    private final LoginService loginService;
    private final TMDBController tmdbController;

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

    @GetMapping("/")
    public String showHomePage(Principal principal, @RequestParam(required = false) String name , Model model) {
        tmdbController.getMoviesDetails(model);
        tmdbController.searchMovies(name, model);
        isLoggedIn(principal, model);
        pageDetails(model);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String moviePage(@PathVariable(required = true) Long id, Principal principal, Model model){
        tmdbController.getMovieDetails(id, model);
        tmdbController.getMoviesDetails(model);
        isLoggedIn(principal, model);
        pageDetails(model);
        return "movie-page";
    }
}

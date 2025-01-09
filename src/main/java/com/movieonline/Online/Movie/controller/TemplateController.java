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
    private final UserController userController;

    public TemplateController(TMDBController tmdbController, AuthenticationUtils authenticationUtils, TMDBService tmdbService, UserController userController) {
        this.tmdbController = tmdbController;
        this.authenticationUtils = authenticationUtils;
        this.tmdbService = tmdbService;
        this.userController = userController;
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
        userController.getUserList(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String moviePage(@PathVariable(required = true) Long id, Principal principal, Model model){
        tmdbController.getMovieDetails(id, model);
        tmdbController.getMoviesDetails(model);
        userController.getUserList(model);
        authenticationUtils.isLoggedIn(principal, model);
        matchingFeedbacks(id, model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "movie-page";
    }

    @GetMapping("/movies/search")
    public String searchPage(Principal principal, Model model){
        userController.getUserList(model);
        authenticationUtils.isLoggedIn(principal, model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "search-page";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(Model model){
        userController.getUserList(model);
        userController.getUserAllUserTypes(model);
        pageDetails(model);
        return "admin/dashboard";
    }

    @GetMapping("/dashboard/users")
    public String usersManagementPage(Model model){
        userController.getUserList(model);
        userController.getUserAllUserTypes(model);
        pageDetails(model);
        return "admin/user-management";
    }

    @GetMapping("/dashboard/movies")
    public String movieManagement(Model model){
        pageDetails(model);
        return "admin/movie-management";
    }
}

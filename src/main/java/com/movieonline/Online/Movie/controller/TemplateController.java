package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserBookingEntity;
import com.movieonline.Online.Movie.security.util.AuthenticationUtils;
import com.movieonline.Online.Movie.service.TMDBService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
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
        userController.getCurrentUser(model);
        userController.getUserList(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "index";
    }

    @GetMapping("/movie/{id}")
    public String moviePage(@PathVariable(required = true) Long id, Principal principal, Model model){
        tmdbController.getMovieDetails(id, model);
        tmdbController.getMoviesDetails(model);
        userController.getCurrentUser(model);
        userController.getUserList(model);
        authenticationUtils.isLoggedIn(principal, model);
        matchingFeedbacks(id, model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        MovieBookingEntity movie = tmdbService.getMovieBooking(id, authenticationUtils.getUsername());
        model.addAttribute("getPlayButton", movie);
        List<MovieBookingEntity> getMovieBooking = tmdbService.getSpecificMovieBooking(id);
        model.addAttribute("getMovieBooking", getMovieBooking);
        pageDetails(model);
        return "movie-page";
    }

    @GetMapping("/movie/play/{id}")
    public String playBookedMovies(@PathVariable Long id, Model model){
        MovieBookingEntity movie = tmdbService.getMovieBooking(id, authenticationUtils.getUsername());
        UserBookingEntity userBooking = tmdbService.getUserMovieBooking(id, movie.getDate().atTime(movie.getTimeSlot()));

        if (userBooking.getDateTime().toLocalDate().equals(LocalDate.now()) &&
                LocalTime.now().isAfter(userBooking.getDateTime().toLocalTime().minusSeconds(1)) &&
                LocalTime.now().isBefore(userBooking.getDateTime().toLocalTime().plusMinutes(20))) {
            userController.getUserList(model);
            userController.getUserAllUserTypes(model);
            userController.getCurrentUser(model);
            model.addAttribute("getUsername", authenticationUtils.getUsername());
            model.addAttribute("WebName", "Cinema Eudamonia");
            return "movie-player";
        }

        return "redirect:/movie/" + id;
    }

    @GetMapping("/movies/search")
    public String searchPage(Principal principal, Model model){
        userController.getUserList(model);
        authenticationUtils.isLoggedIn(principal, model);
        userController.getCurrentUser(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "search-page";
    }

    @GetMapping("/account")
    public String showAccountPage(Principal principal, Model model) {
        userController.getUserList(model);
        userController.getCurrentUser(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "account-page";
    }

    @GetMapping("/booking")
    public String showBookingPage(Model model) {
        userController.getUserBookings(model);
        userController.getUserList(model);
        userController.getCurrentUser(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "booking-page";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(Model model){
        tmdbController.getMoviesDetails(model);
        userController.getUserList(model);
        userController.getUserAllUserTypes(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "admin/dashboard";
    }

    @GetMapping("/dashboard/users")
    public String usersManagementPage(Model model){
        userController.getUserList(model);
        userController.getUserAllUserTypes(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        pageDetails(model);
        return "admin/user-management";
    }

    @GetMapping("/dashboard/booking")
    public String bookingManagement(Model model){
        userController.getUserList(model);
        tmdbController.getAllMovies( model);
        pageDetails(model);
        model.addAttribute("getUsername", authenticationUtils.getUsername());
        return "admin/booking-management";
    }
}

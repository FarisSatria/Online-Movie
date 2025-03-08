package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.model.UserBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.repository.UserRepository;
import com.movieonline.Online.Movie.security.util.AuthenticationUtils;
import com.movieonline.Online.Movie.service.TMDBService;
import com.movieonline.Online.Movie.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private final UserService userService;
    private final AuthenticationUtils authenticationUtils;
    private final UserRepository userRepository;
    private final TMDBService tmdbService;

    public UserController(UserService userService, AuthenticationUtils authenticationUtils, UserRepository userRepository, TMDBService tmdbService) {
        this.userService = userService;
        this.authenticationUtils = authenticationUtils;
        this.userRepository = userRepository;
        this.tmdbService = tmdbService;
    }

    @GetMapping("/api/search/user")
    public String searchUser(@RequestParam String username, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("searchedUser", userService.searchUser(username));

        return "redirect:/dashboard/users";
    }

    public Model getCurrentUser(Model model){
        try{
            return model.addAttribute("getCurrentUser",
                    userService.getCurrentUser(authenticationUtils.getUsername()));
        }catch (RuntimeException r){
            return null;
        }
    }

    public Model getUserList(Model model){
        List<UserEntity> userList = userService.getUsers();
        model.addAttribute("userList", userList);

        return model;
    }

    public Model getUserAllUserTypes(Model model){
        model.addAttribute("adminCount", userService.countAllAdmins());
        model.addAttribute("userCount", userService.countAllUsers());
        return model;
    }

    public Model getUserBookings(Model model) {
        List<UserBookingEntity> bookings = userService.getUserBookings(authenticationUtils.getUsername());

        List<MovieDTO> movieDetails = new ArrayList<>();
        for (UserBookingEntity booking : bookings) {
            MovieDTO movie = tmdbService.getMovie(booking.getMovieId());
            movieDetails.add(movie);
        }

        model.addAttribute("getUserBookings", bookings);
        model.addAttribute("movieDetails", movieDetails);

        return model;
    }

    @PostMapping("/api/user/update")
    public String updateUser(@RequestParam(required = false) String originalUsername,
                             @RequestParam(required = false) String name,
                             @RequestParam(required = false) String username,
                             @RequestParam(required = false) String verifyPassword,
                             @RequestParam MultipartFile profilePicture,
                             @RequestParam(required = false) Boolean isAdmin,
                             RedirectAttributes redirectAttributes) throws IOException {
        if(originalUsername == null){
            userService.updateUser(name, username, authenticationUtils.getUsername(), verifyPassword, profilePicture, null);
            redirectAttributes.addFlashAttribute("updateAccountSuccess", "Account has been updated successfully!");
            return "redirect:/account";
        }else{
            userService.updateUser(name, username, originalUsername, null, profilePicture, isAdmin);
            redirectAttributes.addFlashAttribute("updateAccountSuccess", "Account has been updated successfully!");
            return "redirect:/dashboard/users";
        }
    }

    @GetMapping("/api/user/{id}/delete")
    public String deleteUser(@PathVariable Long id, RedirectAttributes redirectAttributes){
        if (!userRepository.findIsAdminTrueByUsername(authenticationUtils.getUsername())){
            userService.deleteUser(id);
            redirectAttributes.addFlashAttribute("deleteAccountSuccess", "Account has been deleted successfully!");
            return "redirect:/login";
        }else{
            if(!authenticationUtils.getUsername().equals(userRepository.findUsernameById(id))){
                userService.deleteUser(id);
                redirectAttributes.addFlashAttribute("deleteUserSuccess", "User has been deleted successfully!");
                return "redirect:/dashboard/users";
            }else{
                redirectAttributes.addFlashAttribute("deleteUserConflict", "Unable to delete current user!");
                return "redirect:/dashboard/users";
            }
        }
    }
}

package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.repository.UserRepository;
import com.movieonline.Online.Movie.security.util.AuthenticationUtils;
import com.movieonline.Online.Movie.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Objects;

@Controller
public class UserController {

    private final UserService userService;
    private final AuthenticationUtils authenticationUtils;
    private final UserRepository userRepository;

    public UserController(UserService userService, AuthenticationUtils authenticationUtils, UserRepository userRepository) {
        this.userService = userService;
        this.authenticationUtils = authenticationUtils;
        this.userRepository = userRepository;
    }

    @GetMapping("/api/search/user")
    public String searchUser(@RequestParam String username, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("searchedUser", userService.searchUser(username));

        return "redirect:/dashboard/users";
    }

    @GetMapping("/api/user/{id}/delete")
    public String deleteUser(@PathVariable Long id, RedirectAttributes redirectAttributes){
        if(!authenticationUtils.getUsername().equals(userRepository.findUsernameById(id))){
            userService.deleteUser(id);
        }else{
            redirectAttributes.addFlashAttribute("deleteUserConflict", "Unable to delete current User");
        }

        return "redirect:/dashboard/users";
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
}

package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/search/user")
    public String searchUser(@RequestParam String username, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("searchedUser", userService.searchUser(username));

        return "redirect:admin/dashboard/user";
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

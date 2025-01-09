package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private final TemplateController templateController;

    public LoginController(TemplateController templateController) {
        this.templateController = templateController;
    }

    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("invalidCredentials", "Invalid username or password");
        }
        templateController.pageDetails(model);
        return "login";
    }
}

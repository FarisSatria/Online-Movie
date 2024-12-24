package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.exception.GlobalExceptionHandler;
import com.movieonline.Online.Movie.service.LoginService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class LoginController {

    private final LoginService loginService;
    private final TemplateController templateController;

    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("invalidCredentials", "Invalid username or password");
        }
        templateController.pageDetails(model);
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@Valid Authentication authentication,
                              @RequestParam String username,
                              @RequestParam String password,
                              Model model) {
        try {
            loginService.authenticate(authentication);
            return "redirect:/";
        } catch (Exception e) {
            templateController.pageDetails(model);
            return "login";
        }
    }
}

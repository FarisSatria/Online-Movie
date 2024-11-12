package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.AppUserEntity;
import com.movieonline.Online.Movie.service.LoginService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class LoginController {

    private final LoginService loginService;
    private final TemplateController templateController;

    @GetMapping("/login")
    public String loginPage(Model model) {
        templateController.pageDetails(model);
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@Valid AppUserEntity appUserEntity,
                              @RequestParam String username,
                              @RequestParam String password) {
        try {
            loginService.login(appUserEntity);
            return "redirect:/index";
        } catch (Exception e) {
            return "login";
        }
    }
}

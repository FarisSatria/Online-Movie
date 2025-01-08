package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.exception.GlobalExceptionHandler;
import com.movieonline.Online.Movie.service.LoginService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private final LoginService loginService;
    private final TemplateController templateController;

    public LoginController(LoginService loginService, TemplateController templateController) {
        this.loginService = loginService;
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

//    @PostMapping("/login")
//    public String handleLogin(@RequestParam String username,
//                              @RequestParam String password,
//                              Model model) {
//        try {
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            if (authentication.getAuthorities().stream()
//                    .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {
//                return "redirect:/dashboard";
//            }
//
//            System.out.println("Real or Fake?" + authentication);
//
//            return "redirect:/";
//        } catch (Exception e) {
//            templateController.pageDetails(model);
//            return "login";
//        }
//    }
}

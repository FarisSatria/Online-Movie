package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.AppUserEntity;
import com.movieonline.Online.Movie.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody @Valid AppUserEntity appUserEntity) {
//        registrationService.registerUser(appUserEntity, appUserEntity.getUsername(), appUserEntity.getPassword());
//        return ResponseEntity.ok("User registered successfully");
//    }

    private final TemplateController templateController;

    @GetMapping("/register")
    public String loginRegister(Model model) {
        templateController.pageDetails(model);
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(@Valid AppUserEntity appUserEntity,
                              @RequestParam String username,
                              @RequestParam String password) {
      registrationService.registerUser(appUserEntity, appUserEntity.getUsername(), appUserEntity.getPassword());
      return "User registered successfully";
    }

}

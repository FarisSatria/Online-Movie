package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.AppUserEntity;
import com.movieonline.Online.Movie.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;
    private final TemplateController templateController;

//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody @Valid AppUserEntity appUserEntity) {
//        registrationService.registerUser(appUserEntity, appUserEntity.getName(), appUserEntity.getUsername(), appUserEntity.getPassword());
//        return ResponseEntity.ok("User registered successfully");
//    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        templateController.pageDetails(model);
        return "login";
    }

    @PostMapping("/register")
    public String handleRegister(@Valid AppUserEntity appUserEntity,
                                 @RequestParam String name,
                                 @RequestParam String username,
                                 @RequestParam String password,
                                 Model model) {
      registrationService.registerUser(appUserEntity, appUserEntity.getName(), appUserEntity.getUsername(), appUserEntity.getPassword());
      templateController.pageDetails(model);
      return "login";
    }

}

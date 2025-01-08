package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.exception.GlobalExceptionHandler;
import com.movieonline.Online.Movie.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    private final RegistrationService registrationService;
    private final TemplateController templateController;
    private final GlobalExceptionHandler globalExceptionHandler;

    public RegistrationController(RegistrationService registrationService, TemplateController templateController, GlobalExceptionHandler globalExceptionHandler) {
        this.registrationService = registrationService;
        this.templateController = templateController;
        this.globalExceptionHandler = globalExceptionHandler;
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        templateController.pageDetails(model);
        return "login";
    }

    @PostMapping("/register")
    public String handleRegister(@Valid UserEntity userEntity,
                                 @RequestParam String name,
                                 @RequestParam String username,
                                 @RequestParam String password,
                                 Model model) {
      registrationService.registerUser(userEntity, userEntity.getName(), userEntity.getUsername(), userEntity.getPassword());
      templateController.pageDetails(model);
      return "login";
    }

}

package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.exception.UserRegistrationConflictException;
import com.movieonline.Online.Movie.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    private final RegistrationService registrationService;
    private final TemplateController templateController;

    public RegistrationController(RegistrationService registrationService, TemplateController templateController) {
        this.registrationService = registrationService;
        this.templateController = templateController;
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        templateController.pageDetails(model);
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(@Valid UserEntity userEntity,
                                 @RequestParam String name,
                                 @RequestParam String username,
                                 @RequestParam String password,
                                 Model model) {
      try{
          templateController.pageDetails(model);
          registrationService.registerUser(userEntity, userEntity.getName(), userEntity.getUsername(), userEntity.getPassword());
          return "redirect:/login";
      } catch (UserRegistrationConflictException e) {
          templateController.pageDetails(model);
          model.addAttribute("userAlreadyExist", e.getMessage());
          return "register";
      }
    }

}

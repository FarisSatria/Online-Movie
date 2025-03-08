package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.exception.UserRegistrationConflictException;
import com.movieonline.Online.Movie.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

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
    public String handleRegister(@Valid UserEntity  userEntity,
                                 @RequestParam String name,
                                 @RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam(required = false) Boolean isAdmin,
                                 @RequestParam(required = false) MultipartFile profilePicture,
                                 RedirectAttributes redirectAttributes)throws IOException {
      try{
          registrationService.registerUser(userEntity, userEntity.getName(), userEntity.getUsername(), userEntity.getPassword(), isAdmin, profilePicture);
          if (isAdmin != null){
              redirectAttributes.addFlashAttribute("userHasBeenAdded", "User has been added successfully!");
              return "redirect:/dashboard/users";
          } else{
              redirectAttributes.addFlashAttribute("registrationSuccess", "Account has been created!");
              return "redirect:/login";
          }
      } catch (UserRegistrationConflictException e) {
          if (isAdmin != null){
              redirectAttributes.addFlashAttribute("userAlreadyExist", e.getMessage());
              return "redirect:/dashboard/users";
          }else{
              redirectAttributes.addFlashAttribute("userAlreadyExist", e.getMessage());
              return "redirect:/register";
          }
      }
    }

}

package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TemplateController {

    private final LoginService loginService;

    public Model pageDetails(Model model){
        model.addAttribute("WebName", "Cinema Eudamonia");
        return model;
    }

    @GetMapping("/")
    public String indexPage(Model model) {
        pageDetails(model);
        return "index";
    }
}

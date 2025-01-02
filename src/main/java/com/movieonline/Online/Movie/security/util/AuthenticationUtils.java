package com.movieonline.Online.Movie.security.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;

import java.security.Principal;

public class AuthenticationUtils {

    public Model isLoggedIn(Principal principal, Model model){
        boolean isLoggedIn = (principal != null);

        model.addAttribute("isLoggedIn", isLoggedIn);
        if (isLoggedIn) {
            model.addAttribute("username", principal.getName());
        }

        return model;
    }

    public String getUsername(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Object principal = authentication.getPrincipal();
        String username = null;

        if (principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;
            username = userDetails.getUsername();
        } else if (principal instanceof String) {
            username = (String) principal;
        }

        return username;
    }
}

package com.movieonline.Online.Movie.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.io.IOException;
import java.util.Collection;

@Component

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException {

        // Manually retrieve the request from the context
        HttpServletRequest httpRequest = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        // Default redirect
        String redirectUrl = "/";

        // Get user's roles (authorities)
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        // Check if the user has the role 'ROLE_ADMIN'
        for (GrantedAuthority authority : authorities) {
            if ("ROLE_ADMIN".equals(authority.getAuthority())) {
                redirectUrl = "/dashboard"; // Redirect to /dashboard for admins
                break;
            }
        }

        // Redirect user
        response.sendRedirect(redirectUrl);
    }
}

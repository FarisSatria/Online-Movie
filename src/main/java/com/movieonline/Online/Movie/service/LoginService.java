package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.AppUserEntity;
import com.movieonline.Online.Movie.repository.AppUserRepository;
import com.movieonline.Online.Movie.exception.InvalidCredentialsExeption;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@AllArgsConstructor
@Service
public class LoginService implements AuthenticationProvider {

    private final AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        AppUserEntity user = appUserRepository.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("Username not found")
        );

        if (!bCryptPasswordEncoder.matches(password, user.getPassword())) {
            throw new InvalidCredentialsExeption("Invalid credentials!");
        }

        return new UsernamePasswordAuthenticationToken(
                username, password, Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}

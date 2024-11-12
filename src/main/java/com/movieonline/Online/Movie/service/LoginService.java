package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.AppUserEntity;
import com.movieonline.Online.Movie.repository.AppUserRepository;
import com.movieonline.Online.Movie.exception.InvalidCredentialsExeption;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Service
@Slf4j
public class LoginService {

    private final AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AppUserEntity login(AppUserEntity payload) {

        AppUserEntity user = appUserRepository.findByUsername(payload.getUsername()).orElseThrow(
                () -> new UsernameNotFoundException("Username Not Found")
        );

        if (!bCryptPasswordEncoder.matches(payload.getPassword(), user.getPassword())) {
            throw new InvalidCredentialsExeption("Username or Password is Incorrect!");
        }
        return user;
    }
}

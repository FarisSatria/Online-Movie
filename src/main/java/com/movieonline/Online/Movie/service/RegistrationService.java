package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.AppUserEntity;
import com.movieonline.Online.Movie.repository.AppUserRepository;
import com.movieonline.Online.Movie.exception.UserAlreadyExistException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RegistrationService {

    private final AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional(rollbackOn = UserAlreadyExistException.class)
    public AppUserEntity registerUser(AppUserEntity appUserEntity, String username, String password) {
        appUserRepository
                .findByUsername(appUserEntity.getUsername())
                .ifPresent(ignored -> {
                    throw new UserAlreadyExistException("Username is taken");
                });

        appUserEntity.setUsername(username);
        appUserEntity.setPassword(bCryptPasswordEncoder.encode(password));

        return appUserRepository.save(appUserEntity);
    }

}
package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.model.UserEntity;
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
    public UserEntity registerUser(UserEntity userEntity, String name, String username, String password) {
        appUserRepository
                .findByUsername(userEntity.getUsername())
                .ifPresent(ignored -> {
                    throw new UserAlreadyExistException("Username is taken");
                });

        userEntity.setName(name);
        userEntity.setUsername(username);
        userEntity.setPassword(bCryptPasswordEncoder.encode(password));

        return appUserRepository.save(userEntity);
    }

}
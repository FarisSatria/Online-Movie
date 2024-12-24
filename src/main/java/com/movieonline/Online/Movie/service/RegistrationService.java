package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.repository.UserRepository;
import com.movieonline.Online.Movie.exception.UserRegistrationConflictException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RegistrationService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional(rollbackOn = UserRegistrationConflictException.class)
    public UserEntity registerUser(UserEntity userEntity, String name, String username, String password) {
        userRepository
                .findByUsername(userEntity.getUsername())
                .ifPresent(ignored -> {
                    throw new UserRegistrationConflictException("Username is taken");
                });

        userEntity.setName(name);
        userEntity.setUsername(username);
        userEntity.setPassword(bCryptPasswordEncoder.encode(password));

        return userRepository.save(userEntity);
    }

}
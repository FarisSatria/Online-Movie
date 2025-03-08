package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.repository.UserRepository;
import com.movieonline.Online.Movie.exception.UserRegistrationConflictException;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class RegistrationService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public RegistrationService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    @Transactional(rollbackOn = UserRegistrationConflictException.class)
    public UserEntity registerUser(UserEntity userEntity, String name, String username, String password, Boolean isAdmin, MultipartFile profilePicture) throws IOException {
        userRepository
                .findByUsername(userEntity.getUsername())
                .ifPresent(ignored -> {
                    throw new UserRegistrationConflictException("Username is taken!");
                });

        userEntity.setName(name);
        userEntity.setUsername(username);
        userEntity.setPassword(bCryptPasswordEncoder.encode(password));

        if(isAdmin == null){
            userEntity.setIsAdmin(false);
        }else{
            userEntity.setIsAdmin(isAdmin);
        }

        if(isAdmin == null){
            userEntity.setIsAdmin(false);
        }else{
            userEntity.setIsAdmin(isAdmin);
        }

        if (profilePicture != null && !profilePicture.isEmpty()) {
            userEntity.setProfilePicturePath(profilePicture.getBytes());
        }

        return userRepository.save(userEntity);
    }

}
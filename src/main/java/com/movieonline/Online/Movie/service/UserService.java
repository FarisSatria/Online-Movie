package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.model.UserBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.exception.UserRegistrationConflictException;
import com.movieonline.Online.Movie.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserById(Long id){
        return userRepository.findById(id);
    }

    public Long countAllUsers(){
        return userRepository.countUsers();
    }

    public Long countAllAdmins(){
        return userRepository.countAdminUsers();
    }

    @Transactional
    public UserEntity getCurrentUser(String username){
        return userRepository.findByUsername(username).orElseThrow(
                () -> new BadCredentialsException("Invalid credentials!")
        );
    }

    @Transactional
    public List<UserBookingEntity> getUserBookings(String username) {
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return user.getBookings();
    }

    @Transactional
    public List<UserEntity> searchUser(String username){
        return userRepository.findByUsernameIgnoreCase("%" + username + "%");
    }

    @Transactional
    public void updateUser(String name, String username, String originalUsername , String password, MultipartFile profilePicture, Boolean isAdmin) throws IOException {
        UserEntity userEntity = userRepository.findByUsername(originalUsername)
                .orElseThrow(() -> new IllegalStateException("User does not exist!"));

        if (name != null) {
            userEntity.setName(name);
        }

        if (username != null) {
            userEntity.setUsername(username);
        }

        if (password != null) {
            userEntity.setPassword(bCryptPasswordEncoder.encode(password));
        }

        if (profilePicture != null && !profilePicture.isEmpty()) {
            userEntity.setProfilePicturePath(profilePicture.getBytes());
        }

        if (isAdmin != null) {
            userEntity.setIsAdmin(isAdmin);
        }

        userRepository.save(userEntity);
    }

    @Transactional
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}

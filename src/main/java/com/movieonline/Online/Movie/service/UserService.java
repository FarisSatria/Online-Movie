package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    }

    public Long countAllUsers(){
        return userRepository.countUsers();
    }

    public Long countAllAdmins(){
        return userRepository.countAdminUsers();
    }

    public Optional<UserEntity> searchUser(String username){
        System.out.println("Ini di service" + userRepository.findByUsername(username));
        return userRepository.findByUsername(username);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}

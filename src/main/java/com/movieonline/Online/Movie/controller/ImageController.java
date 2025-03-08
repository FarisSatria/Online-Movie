package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ImageController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/image/{userId}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getProfilePicture(@PathVariable Long userId) {
        Optional<UserEntity> userOptional = userService.getUserById(userId);

        if (userOptional.isPresent()) {
            UserEntity user = userOptional.get();
            if (user.getProfilePicturePath() != null) {
                return ResponseEntity.ok().body(user.getProfilePicturePath());
            }
        }

        return ResponseEntity.notFound().build();
    }
}

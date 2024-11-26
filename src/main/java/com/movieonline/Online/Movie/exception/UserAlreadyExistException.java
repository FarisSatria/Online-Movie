package com.movieonline.Online.Movie.exception;

import org.springframework.ui.Model;

public class UserAlreadyExistException extends RuntimeException{
    public UserAlreadyExistException(String message){
        super(message);
    }
}

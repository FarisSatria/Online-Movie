package com.movieonline.Online.Movie.exception;

public class UserRegistrationConflictException extends RuntimeException{
    public UserRegistrationConflictException(String message){
        super(message);
    }
}

package com.movieonline.Online.Movie.exception;

public class InvalidCredentialsExeption extends RuntimeException{
    public InvalidCredentialsExeption(String message){
        super(message);
    }
}

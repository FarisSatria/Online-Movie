package com.movieonline.Online.Movie.exception;

public class MovieBookingConflictException extends RuntimeException {
    public MovieBookingConflictException(String message) {
        super(message);
    }
}

package com.movieonline.Online.Movie;

import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class OnlineMovieApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieApplication.class, args);
	}

}

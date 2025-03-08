package com.movieonline.Online.Movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OnlineMovieApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieApplication.class, args);
	}

}

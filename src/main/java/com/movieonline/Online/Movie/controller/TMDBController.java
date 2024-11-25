package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.service.TMDBService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class TMDBController {

    private final TMDBService tmdbService;

    @GetMapping("/movies/popular")
    public List<MovieDTO> getPopularMovies() {
        return tmdbService.getPopularMovies();
    }

}

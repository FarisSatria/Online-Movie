package com.movieonline.Online.Movie.controller;

import com.movieonline.Online.Movie.entity.MovieCatalogueEntity;
import com.movieonline.Online.Movie.service.MovieCatalogueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/catalogue")
public class MovieCatalogueController {
    private final MovieCatalogueService service;

    @GetMapping
    public List<MovieCatalogueEntity> getMovies() {
        return service.getMovies();
    }

    @PostMapping()
    public void addMovies(@RequestBody MovieCatalogueEntity movieCatalogueEntity){
        service.addMovies(movieCatalogueEntity);
    }

}

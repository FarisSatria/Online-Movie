package com.movieonline.Online.Movie.service;


import com.movieonline.Online.Movie.entity.MovieCatalogueEntity;
import com.movieonline.Online.Movie.repository.MovieCatalogueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MovieCatalogueService {
    private final MovieCatalogueRepository repository;

    public List<MovieCatalogueEntity> getMovies(){
        return repository.findAll();
    }

    public void addMovies(MovieCatalogueEntity movieCatalogueEntity){
        Optional<MovieCatalogueEntity> movieCatalogueEntityOptional = repository
                .findByTitle(movieCatalogueEntity.getTitle());

        if (movieCatalogueEntity.getTitle() == null
                && movieCatalogueEntity.getAgeRating() == null
                && movieCatalogueEntity.getReleaseDate() == null
                && movieCatalogueEntity.getGenre() == null
                && movieCatalogueEntity.getRuntime() == null
                && movieCatalogueEntity.getDescription() == null) {
            throw new IllegalStateException("Data cannot be empty");
        }else if (movieCatalogueEntityOptional.isPresent()){
            throw new IllegalStateException("Movie title taken");
        }

        repository.save(movieCatalogueEntity);
    }
}

package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.MovieCatalogueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieCatalogueRepository
        extends JpaRepository <MovieCatalogueEntity, Long> {

    List<MovieCatalogueEntity> findByTitleContaining(String partialTitle);

    Optional<MovieCatalogueEntity> findByTitle(String title);
}

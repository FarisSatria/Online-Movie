package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBackEntity, Long> {

    Optional<FeedBackEntity> findByUsernameAndMovieId(String username, Long movieId);

    @Query("SELECT f FROM FeedBackEntity f WHERE f.username = ?1 AND f.movieId = ?2 AND f.isDeleted = false")
    Optional<FeedBackEntity> findByUsernameAndMovieIdAndIsDeleted(String username, Long movieId);
}

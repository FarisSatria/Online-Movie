package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBackEntity, Long> {
}

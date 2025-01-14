package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.Date;

@Repository
public interface MovieBookingRepository extends JpaRepository<MovieBookingEntity, Long> {

    @Query("SELECT availableQuota FROM MovieBookingEntity WHERE movieId = :movieId AND date = :date AND time = :time")
    Integer getAvailableQuota(@Param("movieId") Long movieId, @Param("date") Date date, @Param("time") Time time);
}


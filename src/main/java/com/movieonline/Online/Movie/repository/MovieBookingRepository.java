package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface MovieBookingRepository extends JpaRepository<MovieBookingEntity, Long> {

    void deleteByMovieId(Long movieId);

    @Transactional
    @Modifying
    @Query("DELETE FROM MovieBookingEntity m WHERE m.date < CURRENT_DATE OR (m.date = CURRENT_DATE AND m.timeSlot < CURRENT_TIME)")
    void deleteExpiredMovies();

    @Query("SELECT m FROM MovieBookingEntity m WHERE m.movieId =?1")
    List<MovieBookingEntity> findByMovieId (Long movieId);

    @Query("SELECT m FROM MovieBookingEntity m WHERE m.movieId = ?1 AND m.date = ?2 AND m.timeSlot = ?3")
    MovieBookingEntity findAvailableDateTime(Long movieId , LocalDate date, LocalTime timeSlot);

    @Query("SELECT m FROM MovieBookingEntity m WHERE m.movieId = ?1 AND m.username IN ?2")
    MovieBookingEntity findByMovieIdAndUsername(Long movieId, List<String> usernames);

    @Query("SELECT m.availableQuota FROM MovieBookingEntity m WHERE m.movieId = ?1 AND m.date = ?2 AND m.timeSlot = ?3")
    Integer findAvailableQuotaByDateTime(Long movieId , LocalDate date, LocalTime timeSlot);
}



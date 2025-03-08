package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.model.UserBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
    Optional<UserEntity> findByUsername(String username);

    @Query("SELECT u.isAdmin FROM UserEntity u WHERE u.username = ?1")
    Boolean findIsAdminTrueByUsername(String username);

    @Query("SELECT u FROM UserEntity u WHERE LOWER(u.username) LIKE LOWER(?1)")
    List<UserEntity> findByUsernameIgnoreCase(String username);

    @Query("SELECT u.username FROM UserEntity u WHERE u.id = ?1")
    String findUsernameById(Long id);

    @Query("SELECT COUNT(u) FROM UserEntity u WHERE u.isAdmin = true")
    long countAdminUsers();

    @Query("SELECT COUNT(u) FROM UserEntity u WHERE u.isAdmin = false")
    long countUsers();

    @Query("SELECT ub FROM UserEntity u JOIN u.bookings ub WHERE ub.dateTime = ?1 AND ub.movieId = ?2")
    UserBookingEntity findBookingsByDateTimeAndMovieId(LocalDateTime dateTime, Long movieId);

    @Transactional
    @Modifying
    @Query("DELETE FROM UserBookingEntity ub WHERE ub.movieId = ?1")
    void deleteByMovieId(Long movieId);

    @Transactional
    @Modifying
    @Query("DELETE FROM UserBookingEntity u WHERE FUNCTION('TIMESTAMPADD', MINUTE, 20, u.dateTime) < CURRENT_TIMESTAMP")
    void deleteExpiredUserBooking();
}
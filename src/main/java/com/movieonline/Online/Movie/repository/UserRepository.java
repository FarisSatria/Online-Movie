package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    @Query("SELECT COUNT(u) FROM UserEntity u WHERE u.isAdmin = true")
    long countAdminUsers();

    @Query("SELECT COUNT(u) FROM UserEntity u WHERE u.isAdmin = false")
    long countUsers();

}
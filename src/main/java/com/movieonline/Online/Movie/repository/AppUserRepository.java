package com.movieonline.Online.Movie.repository;

import com.movieonline.Online.Movie.entity.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUserEntity, Long> {

    Optional<AppUserEntity> findByUsername(String username);
}
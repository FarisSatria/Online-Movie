package com.movieonline.Online.Movie.entity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long movieId;
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public UserBookingEntity(Long movieId, LocalDateTime dateTime, UserEntity user) {
        this.movieId = movieId;
        this.dateTime = dateTime;
        this.user = user;
    }
}
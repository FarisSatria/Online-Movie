package com.movieonline.Online.Movie.entity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MovieBookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long id;
    private String username;
    private Long movieId;
    private Date date;
    private Time time;
    private Integer available_quota;
    private Integer remaining_quota;

    public MovieBookingEntity(Long movieId, String username, Date date, Time time, Integer available_quota, Integer remaining_quota){
        this.username = username;
        this.movieId = movieId;
        this.date = date;
        this.time = time;
        this.available_quota = available_quota;
        this.remaining_quota = remaining_quota;
    }

    @Override
    public String toString() {
        return String.format("MovieBookingEntity(id=%d, username='%s', movieId='%d', date='%s', time=%f)", id, username, movieId, date, time);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieBookingEntity that = (MovieBookingEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(username, that.username) &&
                Objects.equals(movieId, that.movieId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, movieId, date, time);
    }
}

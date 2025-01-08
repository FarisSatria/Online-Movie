package com.movieonline.Online.Movie.entity.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.List;
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
    private Long movieId;
    private List<String> username;
    private Date date;
    private Time time;
    private Integer available_quota = 50;

    public MovieBookingEntity(List<String> username, Long movieId, Date date, Time time){
        this.username = username;
        this.movieId = movieId;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("MovieBookingEntity(id=%d, movieId='%d', username='%s', date='%s', time=%tm)", id, movieId, username, date, time);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieBookingEntity that = (MovieBookingEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(movieId, that.movieId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(date, that.date) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movieId, username, date, time);
    }
}

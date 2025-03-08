package com.movieonline.Online.Movie.entity.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MovieBookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalTime timeSlot;
    private int availableQuota = 50;
    private Long movieId;

    private List<String> username;

    public MovieBookingEntity(LocalDate date, LocalTime timeSlot, int availableQuota, Long movieId) {
        this.date = date;
        this.timeSlot = timeSlot;
        this.availableQuota = availableQuota;
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return String.format(
                "MovieBookingEntity(id=%d, date=%s, timeSlot=%s, availableQuota=%d, movieId=%d, username=%s)",
                id, date, timeSlot, availableQuota, movieId, username
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieBookingEntity that = (MovieBookingEntity) o;
        return availableQuota == that.availableQuota &&
                Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(timeSlot, that.timeSlot) &&
                Objects.equals(movieId, that.movieId) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, timeSlot, availableQuota, movieId, username);
    }
}

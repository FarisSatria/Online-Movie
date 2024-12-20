package com.movieonline.Online.Movie.entity.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class FeedBackEntity {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String username;
    private Long movieId;
    @Column(length = 1000)
    private String reviews;
    private Double rating;

    public FeedBackEntity(String username, Long movieId, String reviews, Double rating) {
        this.username = username;
        this.movieId = movieId;
        this.reviews = reviews;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return String.format("FeedBackEntity(id=%d, username='%s', movieId='%d', reviews='%s', rating=%f)", id, username, movieId, reviews, rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedBackEntity that = (FeedBackEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(username, that.username) &&
                Objects.equals(movieId, that.movieId) &&
                Objects.equals(reviews, that.reviews) &&
                Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, movieId, reviews, rating);
    }
}

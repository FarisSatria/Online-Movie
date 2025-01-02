package com.movieonline.Online.Movie.entity.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class FeedBackEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private Long movieId;
    @Column(length = 1000)
    private String reviews;
    private Integer rating;
    private Boolean isDeleted = false;

    public FeedBackEntity(Long movieId, String username,String reviews, Integer rating, Boolean isDeleted) {
        this.username = username;
        this.movieId = movieId;
        this.reviews = reviews;
        this.rating = rating;
        this.isDeleted = isDeleted;
    }
    @Override
    public String toString() {
        return String.format("FeedBackEntity(id=%d, username='%s', movieId='%d', reviews='%s', rating=%d, isDeleted=%b)", id, username, movieId, reviews, rating, isDeleted);
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
                Objects.equals(rating, that.rating)&&
                Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, movieId, reviews, rating, isDeleted);
    }
}

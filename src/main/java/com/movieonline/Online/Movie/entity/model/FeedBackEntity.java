package com.movieonline.Online.Movie.entity.model;

import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
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
    private String reviews;
    private Double rating;

    public FeedBackEntity(String reviews, Double rating) {
        this.reviews = reviews;
        this.rating = rating;
    }
}

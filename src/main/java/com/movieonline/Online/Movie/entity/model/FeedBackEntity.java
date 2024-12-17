package com.movieonline.Online.Movie.entity.model;

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
    @Column(length = 11)
    private Long id;
    @NotBlank(message = "Reviews cannot be empty")
    private String reviews;
    @NotBlank(message = "Rating cannot be empty")
    private Double rating;

    public FeedBackEntity(String reviews, Double rating) {
        this.reviews = reviews;
        this.rating = rating;
    }
}

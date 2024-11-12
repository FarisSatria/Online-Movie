package com.movieonline.Online.Movie.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MovieCatalogueEntity {
    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    private long id;
    private String title;
    private String ageRating;
    private Date releaseDate;
    private String genre;
    private Time runtime;
    private String description;

    public MovieCatalogueEntity(String title, String ageRating, Date releaseDate,
                                String genre, Time runtime, String description){
        this.title = title;
        this.ageRating = ageRating;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.runtime = runtime;
        this.description = description;
    }
}

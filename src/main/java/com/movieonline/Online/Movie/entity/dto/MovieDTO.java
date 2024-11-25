package com.movieonline.Online.Movie.entity.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MovieDTO {
    private long id;
    private String title;
    private String overview;
    private String poster_path;
    private String release_date;
    private double vote_average;
}

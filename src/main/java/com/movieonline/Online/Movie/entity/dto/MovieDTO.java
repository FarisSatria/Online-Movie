package com.movieonline.Online.Movie.entity.dto;

import lombok.Data;

@Data
public class MovieDTO {
    private long id;
    private String title;
    private String overview;
    private String poster_path;
    private String backdrop_path;
    private String release_date;
    private double vote_average;
}

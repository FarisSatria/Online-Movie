package com.movieonline.Online.Movie.entity.dto;

import lombok.Data;

@Data
public class MovieCastDTO {
    private long id;
    private String known_for_department;
    private String name;
    private String profile_path;
    private String character;
    private double popularity;
}

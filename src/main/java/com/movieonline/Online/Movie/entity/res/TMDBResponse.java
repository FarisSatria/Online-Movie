package com.movieonline.Online.Movie.entity.res;

import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import lombok.Data;

import java.util.List;

@Data
public class TMDBResponse {
    private List<MovieDTO> results;
}
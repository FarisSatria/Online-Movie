package com.movieonline.Online.Movie.entity.res;

import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import lombok.Data;

import java.util.List;

@Data
public class TMDBMovieReviewResponse {
    private List<MovieReviewsDTO> results;
}

package com.movieonline.Online.Movie.entity.res;

import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import lombok.Data;

import java.util.List;

@Data
public class TMDBMovieResponse {
    private List<MovieDTO> results;
}

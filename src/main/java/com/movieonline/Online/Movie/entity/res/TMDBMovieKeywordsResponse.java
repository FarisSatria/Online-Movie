package com.movieonline.Online.Movie.entity.res;

import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import lombok.Data;

import java.util.List;

@Data
public class TMDBMovieKeywordsResponse {
    private List<MovieKeywordsDTO> keywords;
}

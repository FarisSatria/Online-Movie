package com.movieonline.Online.Movie.entity.res;

import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import lombok.Data;

import java.util.List;

@Data
public class TMDBMovieCastResponseMultiple {
    private List<MovieCastDTO> cast;
}

package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.res.TMDBMovieResponseMultiple;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TMDBService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private final String baseUrl;

    public TMDBService(
            @Value("${tmdb.api.key}") String apiKey,
            @Value("${tmdb.base.url}") String baseUrl,
            RestTemplate restTemplate
    ) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
    }

    // Fetch Movies
    public MovieDTO getMovie(Long id){
        String url = String.format("%s/movie/%d?api_key=%s", baseUrl, id, apiKey);
        MovieDTO movie = restTemplate.getForObject(url, MovieDTO.class);
        return movie;
    }

    public List<MovieDTO> getPopularMovies() {
        String url = String.format("%s/movie/popular?api_key=%s", baseUrl, apiKey);
        TMDBMovieResponseMultiple response = restTemplate.getForObject(url, TMDBMovieResponseMultiple.class);
        return response.getResults();
    }

    public List<MovieDTO> getTopRatedMovies() {
        String url = String.format("%s/movie/top_rated?api_key=%s", baseUrl, apiKey);
        TMDBMovieResponseMultiple response = restTemplate.getForObject(url, TMDBMovieResponseMultiple.class);
        return response.getResults();
    }

    public List<MovieDTO> getUpcomingMovies() {
        String url = String.format("%s/movie/upcoming?api_key=%s", baseUrl, apiKey);
        TMDBMovieResponseMultiple response = restTemplate.getForObject(url, TMDBMovieResponseMultiple.class);
        return response.getResults();
    }

    // Fetch Movies Miscellaneous
    public List<MovieCastDTO> getMovieCast(Long id){
        String url = String.format("%s/movie/%d/credits?api_key=%s", baseUrl, id, apiKey);
        TMDBMovieResponseMultiple response = restTemplate.getForObject(url, TMDBMovieResponseMultiple.class);
        return response.getCast();
    }

    public List<MovieDTO> getMovieRecommendation(Long id){
        String url = String.format("%s/movie/%d/recommendations?api_key=%s", baseUrl, id, apiKey);
        TMDBMovieResponseMultiple response = restTemplate.getForObject(url, TMDBMovieResponseMultiple.class);
        return response.getResults();
    }

    public List<MovieKeywordsDTO> getMovieKeywords(Long id){
        String url = String.format("%s/movie/%d/keywords?api_key=%s", baseUrl, id, apiKey);
        TMDBMovieResponseMultiple response = restTemplate.getForObject(url, TMDBMovieResponseMultiple.class);
        return response.getKeywords();
    }
}

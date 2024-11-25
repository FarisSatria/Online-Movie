package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.controller.TMDBController;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.res.TMDBResponse;
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

    public List<MovieDTO> getPopularMovies() {
        String url = String.format("%s/movie/popular?api_key=%s", baseUrl, apiKey);
        TMDBResponse response = restTemplate.getForObject(url, TMDBResponse.class);
        return response.getResults();
    }

    public List<MovieDTO> getTopRatedMovies() {
        String url = String.format("%s/movie/top_rated?api_key=%s", baseUrl, apiKey);
        TMDBResponse response = restTemplate.getForObject(url, TMDBResponse.class);
        return response.getResults();
    }

    public List<MovieDTO> getUpcomingMovies() {
        String url = String.format("%s/movie/upcoming?api_key=%s", baseUrl, apiKey);
        TMDBResponse response = restTemplate.getForObject(url, TMDBResponse.class);
        return response.getResults();
    }
}

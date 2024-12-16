package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.controller.GuestSessionController;
import com.movieonline.Online.Movie.entity.dto.MovieCastDTO;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import com.movieonline.Online.Movie.entity.res.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;


import java.util.List;

@Service
public class TMDBService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private final String baseUrl;
    private final GuestSessionController guestSessionController;

    public TMDBService(
            @Value("${tmdb.api.key}") String apiKey,
            @Value("${tmdb.base.url}") String baseUrl,
            RestTemplate restTemplate,
            GuestSessionController guestSessionController
    ) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
        this.guestSessionController = guestSessionController;
    }

    // Fetch Movies
    public MovieDTO getMovie(Long id){
        String url = String.format("%s/movie/%d?api_key=%s", baseUrl, id, apiKey);
        MovieDTO movie = restTemplate.getForObject(url, MovieDTO.class);
        return movie;
    }

    public List<MovieDTO> getNowPlayingMovies() {
        String url = String.format("%s/movie/popular?api_key=%s", baseUrl, apiKey);
        TMDBMovieResponse response = restTemplate.getForObject(url, TMDBMovieResponse.class);
        return response.getResults();
    }

    public List<MovieDTO> getPopularMovies() {
        String url = String.format("%s/movie/popular?api_key=%s", baseUrl, apiKey);
        TMDBMovieResponse response = restTemplate.getForObject(url, TMDBMovieResponse.class);
        return response.getResults();
    }

    public List<MovieDTO> getTopRatedMovies() {
        String url = String.format("%s/movie/top_rated?api_key=%s", baseUrl, apiKey);
        TMDBMovieResponse response = restTemplate.getForObject(url, TMDBMovieResponse.class);
        return response.getResults();
    }

    public List<MovieDTO> getUpcomingMovies() {
        String url = String.format("%s/movie/upcoming?api_key=%s", baseUrl, apiKey);
        TMDBMovieResponse response = restTemplate.getForObject(url, TMDBMovieResponse.class);
        return response.getResults();
    }

    // Fetch Movies Miscellaneous
    public List<MovieCastDTO> getMovieCast(Long id){
        String url = String.format("%s/movie/%d/credits?api_key=%s", baseUrl, id, apiKey);
        TMDBMovieCastResponse response = restTemplate.getForObject(url, TMDBMovieCastResponse.class);
        return response.getCast();
    }

    public List<MovieDTO> getMovieRecommendation(Long id){
        String url = String.format("%s/movie/%d/recommendations?api_key=%s", baseUrl, id, apiKey);
        TMDBMovieResponse response = restTemplate.getForObject(url, TMDBMovieResponse.class);
        return response.getResults();
    }

    public List<MovieKeywordsDTO> getMovieKeywords(Long id){
        String url = String.format("%s/movie/%d/keywords?api_key=%s", baseUrl, id, apiKey);
        TMDBMovieKeywordsResponse response = restTemplate.getForObject(url, TMDBMovieKeywordsResponse.class);
        return response.getKeywords();
    }

    public List<MovieReviewsDTO> getMovieReviews(Long id){
        String url = String.format("%s/movie/%d/reviews?api_key=%s", baseUrl, id, apiKey);
        TMDBMovieReviewResponse response = restTemplate.getForObject(url, TMDBMovieReviewResponse.class);
        return response.getResults();
    }

    //Add Movies Miscellaneous
    public String provideFeedback(long id, Double rating, String review, String guestSessionId) {
        String responseMessage = "";

        if (rating != null) {
            String ratingUrl = String.format("%s/movie/%d/rating?api_key=%s&guest_session_id=%s",
                    baseUrl, id, apiKey, guestSessionId);
            String ratingBody = String.format("{\"value\": %.1f}", rating);

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");

            HttpEntity<String> ratingRequest = new HttpEntity<>(ratingBody, headers);

            try {
                ResponseEntity<String> ratingResponse = restTemplate.postForEntity(ratingUrl, ratingRequest, String.class);
                System.out.println("Rating API response: " + ratingResponse.getBody());
                responseMessage += "Rating submitted. ";
            } catch (Exception e) {
                throw new RuntimeException("Failed to submit rating: " + e.getMessage(), e);
            }
        }

        if (review != null && !review.isEmpty()) {
            String reviewUrl = String.format("%s/movie/%d/reviews?api_key=%s&guest_session_id=%s",
                    baseUrl, id, apiKey, guestSessionId);
            String reviewBody = String.format("{\"review\": \"%s\"}", review);

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");

            HttpEntity<String> reviewRequest = new HttpEntity<>(reviewBody, headers);

            try {
                ResponseEntity<String> reviewResponse = restTemplate.postForEntity(reviewUrl, reviewRequest, String.class);
                System.out.println("Review API response: " + reviewResponse.getBody());
                responseMessage += "Review submitted.";
            } catch (Exception e) {
                throw new RuntimeException("Failed to submit review: " + e.getMessage(), e);
            }
        }

        return responseMessage;
    }

}

package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.MovieBookingEntity;
import com.movieonline.Online.Movie.entity.res.*;
import com.movieonline.Online.Movie.exception.FeedbackInvalidCredentials;
import com.movieonline.Online.Movie.exception.UserRegistrationConflictException;
import com.movieonline.Online.Movie.repository.FeedBackRepository;
import com.movieonline.Online.Movie.repository.MovieBookingRepository;
import com.movieonline.Online.Movie.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TMDBService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private final String baseUrl;
    private final FeedBackRepository feedBackRepository;
    private final UserRepository userRepository;
    private final MovieBookingRepository movieBookingRepository;

    public TMDBService(
            @Value("${tmdb.api.key}") String apiKey,
            @Value("${tmdb.base.url}") String baseUrl,
            RestTemplate restTemplate,
            FeedBackRepository feedBackRepository,
            UserRepository userRepository, MovieBookingRepository movieBookingRepository
    ) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
        this.feedBackRepository = feedBackRepository;
        this.userRepository = userRepository;
        this.movieBookingRepository = movieBookingRepository;
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

    public List<MovieDTO> searchMovies(String name){
        String url = String.format("%s/search/movie?api_key=%s&query=%s", baseUrl, apiKey, name);
        TMDBMovieResponse response = restTemplate.getForObject(url, TMDBMovieResponse.class);
        return response.getResults();
    }

    public List<FeedBackEntity> getFeedback(){
        return feedBackRepository.findAll();
    }

    //Add Movies Miscellaneous
    @Transactional(rollbackOn = UserRegistrationConflictException.class)
    public void provideFeedback(FeedBackEntity feedBackEntity,
                                String username,
                                Long movieId,
                                String reviews,
                                Integer rating) {
        feedBackEntity.setUsername(username);
        feedBackEntity.setMovieId(movieId);
        feedBackEntity.setReviews(reviews);
        feedBackEntity.setRating(rating);

        feedBackRepository.save(feedBackEntity);
    }

    @Transactional(rollbackOn = UserRegistrationConflictException.class)
    public void updateFeedback(Long movieId,
                               String username,
                               String reviews,
                               Integer rating) {
        FeedBackEntity feedBack = feedBackRepository.findByUsernameAndMovieIdAndIsDeleted(username, movieId)
                .orElseThrow(() -> new FeedbackInvalidCredentials("Feedback Username-" + username + " and " + movieId + " cannot be found"));

        feedBack.setReviews(reviews);
        feedBack.setRating(rating);

        feedBackRepository.save(feedBack);
    }

    @Transactional(rollbackOn = UserRegistrationConflictException.class)
    public void deleteFeedback(Long movieId, String username){
        FeedBackEntity feedBack = feedBackRepository.findByUsernameAndMovieIdAndIsDeleted(username, movieId)
                .orElseThrow(() -> new FeedbackInvalidCredentials("Feedback Username-" + username + " and " + movieId + " cannot be found"));

        System.out.println(feedBack.getIsDeleted());
        feedBack.setIsDeleted(true);

        feedBackRepository.save(feedBack);
    }

    @Transactional(rollbackOn = Exception.class)
    public void addBooking(MovieBookingEntity movieBookingEntity, String username, Long movieId) {

        if (movieBookingEntity.getUsername() == null) {
            movieBookingEntity.setUsername(new ArrayList<>());
        }
        movieBookingEntity.getUsername().add(username);
        movieBookingEntity.setMovieId(movieId);

        if (movieBookingEntity.getDate() == null || movieBookingEntity.getTime() == null) {
            throw new IllegalArgumentException("Invalid date or time provided");
        }

        Integer availableQuota = movieBookingRepository.getAvailableQuota(movieBookingEntity.getMovieId(), movieBookingEntity.getDate(), movieBookingEntity.getTime());

        if (availableQuota == null || availableQuota <= 0) {
            throw new RuntimeException("No available slots for the selected date and time");
        }

        movieBookingEntity.setAvailable_quota(availableQuota - 1);

        movieBookingRepository.save(movieBookingEntity);
    }
}

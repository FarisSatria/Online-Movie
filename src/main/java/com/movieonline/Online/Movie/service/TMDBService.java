package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.res.*;
import com.movieonline.Online.Movie.exception.UserAlreadyExistException;
import com.movieonline.Online.Movie.repository.FeedBackRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TMDBService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private final String baseUrl;
    @Autowired
    private final FeedBackRepository feedBackRepository;

    public TMDBService(
            @Value("${tmdb.api.key}") String apiKey,
            @Value("${tmdb.base.url}") String baseUrl,
            RestTemplate restTemplate,
            FeedBackRepository feedBackRepository
    ) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
        this.feedBackRepository = feedBackRepository;
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
        System.out.println(feedBackRepository.findAll());
        return feedBackRepository.findAll();
    }

    //Add Movies Miscellaneous
    @Transactional(rollbackOn = UserAlreadyExistException.class)
    public void provideFeedback(FeedBackEntity feedBackEntity,
                                String username,
                                Long movieId,
                                String reviews,
                                Double rating) {
        feedBackEntity.setUsername(username);
        feedBackEntity.setMovieId(movieId);
        feedBackEntity.setReviews(reviews);
        feedBackEntity.setRating(rating);

        System.out.println("results:" + reviews + rating);
        feedBackRepository.save(feedBackEntity);
    }

}

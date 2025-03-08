package com.movieonline.Online.Movie.service;

import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.model.*;
import com.movieonline.Online.Movie.entity.res.*;
import com.movieonline.Online.Movie.exception.FeedbackInvalidCredentials;
import com.movieonline.Online.Movie.exception.MovieBookingConflictException;
import com.movieonline.Online.Movie.exception.MovieBookingToggle;
import com.movieonline.Online.Movie.repository.FeedBackRepository;
import com.movieonline.Online.Movie.repository.MovieBookingRepository;
import com.movieonline.Online.Movie.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            FeedBackRepository feedBackRepository, UserRepository userRepository,
            MovieBookingRepository movieBookingRepository
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

    public List<MovieDTO> getMovies(List<Long> ids) {
        return ids.stream()
                .map(this::getMovie)
                .toList();
    }

    public List<MovieDTO> getAllMovies(Integer pageNumber){
        String url = String.format("%s/discover/movie?api_key=%s&page=%d", baseUrl, apiKey, pageNumber);
        TMDBMovieResponse response = restTemplate.getForObject(url, TMDBMovieResponse.class);
        return response.getResults();
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
    @Transactional
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

    @Transactional
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

    @Transactional
    public void deleteFeedback(Long movieId, String username){
        FeedBackEntity feedBack = feedBackRepository.findByUsernameAndMovieIdAndIsDeleted(username, movieId)
                .orElseThrow(() -> new FeedbackInvalidCredentials("Feedback Username-" + username + " and " + movieId + " cannot be found"));
        feedBack.setIsDeleted(true);

        feedBackRepository.save(feedBack);
    }

    @Transactional
    public void submitBooking(Long movieId, String username, LocalDate bookedDate, LocalTime bookedTime){
        MovieBookingEntity movie = movieBookingRepository.findAvailableDateTime(
                movieId, bookedDate, bookedTime);

        if(movie == null){
            throw new MovieBookingConflictException("Movie is unavailable for booking!");
        } else if (movie.getAvailableQuota() == 0) {
            throw new MovieBookingConflictException("Movie quota is full!");
        } else if (movie.getUsername().contains(username)){
            throw new MovieBookingConflictException("Movie has already been booked!");
        }

        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new MovieBookingToggle("User does not exist!"));

        UserBookingEntity newBooking = new UserBookingEntity(movieId, bookedDate.atTime(bookedTime), user);

        user.getBookings().add(newBooking);

        movie.getUsername().add(username);
        movie.setAvailableQuota(movie.getAvailableQuota() - 1);

        userRepository.save(user);
        movieBookingRepository.save(movie);
    }

    @Transactional
    public Integer getAvailableQuota(Long id, LocalDate date, LocalTime time){
        return movieBookingRepository.findAvailableQuotaByDateTime(id, date, time);
    }

    @Transactional
    public void cancelBooking(Long movieId, String usernameToRemove){
        MovieBookingEntity movieBooking = movieBookingRepository.findByMovieIdAndUsername(movieId, List.of(usernameToRemove));
        movieBooking.getUsername().removeIf(username -> username.equals(usernameToRemove));
        movieBooking.setAvailableQuota(movieBooking.getAvailableQuota() + 1);

        userRepository.deleteByMovieId(movieId);

        movieBookingRepository.save(movieBooking);
    }

    @Scheduled(fixedRate = 7200000) // Runs every 2 hours
    public void checkMoviesTime() {
        movieBookingRepository.deleteExpiredMovies();
        userRepository.deleteExpiredUserBooking();
        System.out.println("Deleted all expired movies.");
    }

    @Transactional
    public MovieBookingEntity getMovieBooking(Long movieId, String username){
        MovieBookingEntity movie = movieBookingRepository
                .findByMovieIdAndUsername(movieId, List.of(username));

        return movie;
    }

    @Transactional
    public List<MovieBookingEntity> getSpecificMovieBooking(Long movieId){
       return movieBookingRepository.findByMovieId(movieId);
    }

    @Transactional
    public UserBookingEntity getUserMovieBooking(Long movieId, LocalDateTime dateTime){
        UserBookingEntity user = userRepository.findBookingsByDateTimeAndMovieId(dateTime, movieId);

        return user;
    }

    @Transactional
    public void enableMovieBooking(Long movieId) {
        Optional<MovieBookingEntity> findMovie = movieBookingRepository.findByMovieId(movieId)
                .stream()
                .findFirst();

        if (findMovie.isPresent()) {
            throw new MovieBookingToggle("Movie has already been enabled!");
        }

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        int[] timeSlots = {9, 11, 13, 15, 17};

        for (int i = 0; i < 7; i++) { // Enables for the next 7 days
            LocalDate bookingDate = today.plusDays(i);

            for (int hour : timeSlots) {
                LocalTime bookingTime = LocalTime.of(hour, 0);

                // Skip past time slots for today
                if (bookingDate.equals(today) && bookingTime.isBefore(now)) {
                    continue;
                }

                MovieBookingEntity booking = new MovieBookingEntity();
                booking.setMovieId(movieId);
                booking.setDate(bookingDate);
                booking.setTimeSlot(bookingTime);
                booking.setAvailableQuota(50);
                booking.setUsername(new ArrayList<>());
                movieBookingRepository.save(booking);
            }
        }
    }


    @Transactional
    public void disableMovieBooking(Long movieId){
        Optional<MovieBookingEntity> findMovie = movieBookingRepository.findByMovieId(movieId)
                .stream()
                .findFirst();

        if(findMovie.isEmpty()){
            throw new MovieBookingToggle("Movie has already been disabled!");
        }

        movieBookingRepository.deleteByMovieId(movieId);
    }
}

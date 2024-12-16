package com.movieonline.Online.Movie.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class GuestSessionService {

    private final RestTemplate restTemplate;
    private final String apiKey;
    private final String baseUrl;

    public GuestSessionService(
            @Value("${tmdb.api.key}") String apiKey,
            @Value("${tmdb.base.url}") String baseUrl,
            RestTemplate restTemplate
    ) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
    }

    public String createGuestSession() {
        String url = String.format("https://api.themoviedb.org/3/authentication/guest_session/new?api_key=%s", apiKey);

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);

        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            return (String) response.getBody().get("guest_session_id");
        } else {
            throw new RuntimeException("Failed to create guest session");
        }
    }
}

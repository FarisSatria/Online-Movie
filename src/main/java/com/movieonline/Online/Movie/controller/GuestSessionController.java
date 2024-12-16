package com.movieonline.Online.Movie.controller;
import com.movieonline.Online.Movie.service.GuestSessionService;
import com.movieonline.Online.Movie.service.TMDBService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class GuestSessionController {

    private final GuestSessionService guestSessionService;

    @GetMapping("/guest-session")
    public String getGuestSessionId() {
        return guestSessionService.createGuestSession();
    }
}


package com.movieonline.Online.Movie.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MovieDTO {
    private long id;
    private String title;
    private String overview;
    private String poster_path;
    private String backdrop_path;
    private String release_date;
    private String status;
    private String english_name;
    private String budget;
    private String revenue;
    private double vote_average;

    @JsonProperty("spoken_languages")
    public void setEnglishNameFromLanguages(List<Map<String, String>> spokenLanguages) {
        if (spokenLanguages != null && !spokenLanguages.isEmpty()) {
            this.english_name = spokenLanguages.get(0).get("english_name");
        }
    }
}

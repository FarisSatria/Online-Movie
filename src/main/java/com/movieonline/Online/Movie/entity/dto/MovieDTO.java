package com.movieonline.Online.Movie.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.text.DecimalFormat;
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
    private List<MovieGenresDTO> genres;
    @OneToMany(mappedBy = "movieId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FeedBackEntity> feedbacks;
    private int runtime;
    private String runtimeFormatted;
    private String adult;
    private String adultFormatted;
    private String english_name;
    private String budget;
    private String budgetFormatted;
    private String revenue;
    private String revenueFormatted;
    private double vote_average;

    @JsonProperty("spoken_languages")
    public void setEnglishNameFromLanguages(List<Map<String, String>> spokenLanguages) {
        if (spokenLanguages != null && !spokenLanguages.isEmpty()) {
            this.english_name = spokenLanguages.get(0).get("english_name");
        }
    }

    @JsonProperty("runtime")
    public void setSecondToHours(int runtimeInMinute) {
        int hours = runtimeInMinute / 60;
        int minutes = runtimeInMinute % 60;

        this.runtimeFormatted = String.format("%d hours %d minutes", hours, minutes);
    }

    @JsonProperty("adult")
    public void checkAgeRating(String adultRating){
        if (adultRating.equals("true")){
            this.adultFormatted = String.format("18+");
        }else{
            this.adultFormatted = String.format("16+");
        }
    }

    @JsonProperty("budget")
    public void addCommasToBudget(String originalBudget){
        double amount = Double.parseDouble(originalBudget);
        DecimalFormat formatter = new DecimalFormat("#,###");

        this.budgetFormatted = formatter.format(amount);
    }

    @JsonProperty("revenue")
    public void addCommasToRevenue(String originalRevenue){
        double amount = Double.parseDouble(originalRevenue);
        DecimalFormat formatter = new DecimalFormat("#,###");

        this.revenueFormatted = formatter.format(amount);
    }
}


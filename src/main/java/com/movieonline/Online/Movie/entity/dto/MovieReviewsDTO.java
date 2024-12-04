package com.movieonline.Online.Movie.entity.dto;

import lombok.Data;


@Data
public class MovieReviewsDTO {
    private String author;
    private String content;
    private MovieAuthorDetailsReviewDTO author_details;
}

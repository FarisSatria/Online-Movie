package com.movieonline.Online.Movie.entity.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class MovieBookingDTO {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(length = 11)
    private long id;
    private MovieDTO movieDTO;
    private Date date;
    private Time time;
    private int quota;

    public MovieBookingDTO(Date date, Time time, int quot){
        this.date = getDate();
        this.time = getTime();
        this.quota = getQuota();
    }
}

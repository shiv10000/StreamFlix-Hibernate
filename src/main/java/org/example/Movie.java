package org.example;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String genere;

    private LocalDate releaseDate;

    private double rating;

    public Movie(String title, String genere, LocalDate releaseDate, double rating) {
        this.title = title;
        this.genere = genere;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public Movie() {

    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenere() {
        return genere;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }


}

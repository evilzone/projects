package com.software_design.bookmyshow;

public class Movie {

    int movieId;
    String movieName;
    int movieDurationInMins;

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieDurationInMins() {
        return movieDurationInMins;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDurationInMins(int movieDurationInMins) {
        this.movieDurationInMins = movieDurationInMins;
    }
}

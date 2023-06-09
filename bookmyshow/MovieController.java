package com.software_design.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieController {

    HashMap<City, List<Movie>> cityToMovies;
    List<Movie> allMovies;

    public MovieController() {
        cityToMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(City city, Movie movie) {
        allMovies.add(movie);

        List<Movie> movies = cityToMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityToMovies.put(city, movies);
    }

    public Movie getMovieByName(String movieName) {

        for(Movie movie : allMovies) {
            if(movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }
}

package com.tata.javatests.movies.service;

import com.tata.javatests.movies.data.MovieRepository;
import com.tata.javatests.movies.model.Genre;
import com.tata.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
            .filter(m -> m.getGenre() == genre)
            .collect(Collectors.toList());
    }
}

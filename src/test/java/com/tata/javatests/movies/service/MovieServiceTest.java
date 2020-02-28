package com.tata.javatests.movies.service;

import com.tata.javatests.movies.data.MovieRepository;
import com.tata.javatests.movies.model.Genre;
import com.tata.javatests.movies.model.Movie;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {
    @Test
    public void return_movies_by_genre() {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Jackson", 113, Genre.THRILLER),
                        new Movie(3, "Pataclaun", 152, Genre.COMEDY),
                        new Movie(4, "Jackson 2", 152, Genre.THRILLER),
                        new Movie(5, "Alan Poe", 152, Genre.HORROR),
                        new Movie(6, "Wasap de JB", 152, Genre.COMEDY),
                        new Movie(7, "Avengers", 152, Genre.ACTION)
                )
        );

        MovieService movieService = new MovieService(movieRepository);
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer> movieIds = movies.stream().map(m -> m.getId())
                                    .collect(Collectors.toList());
        assertEquals(movieIds, Arrays.asList(3, 6));
    }
}
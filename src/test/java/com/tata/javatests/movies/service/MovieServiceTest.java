package com.tata.javatests.movies.service;

import com.tata.javatests.movies.data.MovieRepository;
import com.tata.javatests.movies.model.Genre;
import com.tata.javatests.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {
    MovieRepository movieRepository;
    MovieService movieService;

    @Before
    public void setUp() throws Exception {
        movieRepository = Mockito.mock(MovieRepository.class);
        movieService = new MovieService(movieRepository);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Jackson", 113, Genre.THRILLER),
                        new Movie(3, "Pataclaun", 119, Genre.COMEDY),
                        new Movie(4, "Jackson 2", 112, Genre.THRILLER),
                        new Movie(5, "Alan Poe", 111, Genre.HORROR),
                        new Movie(6, "Wasap de JB", 103, Genre.COMEDY),
                        new Movie(7, "Avengers", 136, Genre.ACTION)
                )
        );
    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(m -> m.getId())
                .collect(Collectors.toList());
    }

    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer> movieIds = getMovieIds(movies);
        assertEquals(movieIds, Arrays.asList(3, 6));
    }

    @Test
    public void return_movies_by_lengt() {
        Collection<Movie> movies = movieService.findMoviesByLength(119);
        List<Integer> movieIds = getMovieIds(movies);
        assertEquals(movieIds, Arrays.asList(2, 3, 4, 5, 6));
    }
}
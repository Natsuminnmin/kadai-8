package com.example.movielist;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private MovieMapper movieMapper;

    public MovieService(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<Movie> findMoviesStartingWith(String prefix) {
        return movieMapper.findByMovieStartingWith(prefix);
    }

    public Movie findMovie(int id) {
        Optional<Movie> movie = movieMapper.findById(id);
        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw new MovieNotFoundException("There is not this id" + id + " registration.");
        }
    }
}

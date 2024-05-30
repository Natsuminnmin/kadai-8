package com.example.movielist;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private MovieMapper movieMapper;

    public MovieController(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public MovieMapper getMovieMapper() {
        return movieMapper;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies(){
    List<Movie> movies = movieMapper.findAll();
    return movies;
    }
}

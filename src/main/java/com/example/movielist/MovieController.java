package com.example.movielist;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/movies")
    public List<Movie> findByMovies(@RequestParam String startsWith) {
        List<Movie> movies = movieService.findMoviesStartingWith(startsWith);
        return movies;
    }

    @GetMapping("/movies/{id}")
    public Movie findMovie(@PathVariable("id") int id) {
        return movieService.findMovie(id);
    }

}


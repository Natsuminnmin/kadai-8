package com.example.movielist;

public class Movie {

    private int id;
    private String name;
    private String director;

    public Movie(int id, String name, String director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }
}

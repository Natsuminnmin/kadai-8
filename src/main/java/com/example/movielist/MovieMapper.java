package com.example.movielist;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {

    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE name LIKE CONCAT(#{prefix}, '%')")
    List<Movie> findByMovieStartingWith(String prefix);

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Optional<Movie> findById(int id);

}

package com.javalecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.addAll(MovieExtractor.getMoviesFromAmazon("Movie"));
        movies.addAll(MovieExtractor.getMoviesFromNetflix("Movie"));

        slice(movies);

    }

    public static void slice(List<Movie> movies) {

        List<String> moviesList =  movies.stream()
                .filter(movie -> movie.getRating() > 4)
                .limit(5)
                .skip(5)
                .map(movie -> movie.getName())
                .distinct()
                .collect(Collectors.toList());

    }


    //Matching - noneMatch, allMatch, anyMatch
    // Finding
    //short-circuit


}

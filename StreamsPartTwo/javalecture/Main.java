package com.javalecture;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.addAll(MovieExtractor.getMoviesFromAmazon("Movie"));
        movies.addAll(MovieExtractor.getMoviesFromNetflix("Movie"));

        collectToMap(movies);

    }


    public static void collectToMap(List<Movie> movies) {

        //GROUP BY
        Map<Long,Movie> moviesMap = movies.stream()
                .collect(Collectors.toMap(
                        movie -> movie.getId(),
                        movie -> movie,
                        (movieOne,movieTwo) -> movieOne.getDuration() <= movieTwo.getDuration() ? movieOne : movieTwo
                ));


        Map<Double,List<Movie>> moviesRating =  moviesMap.values().stream()
                .collect(Collectors.groupingBy(Movie::getRating));


        for (double key : moviesRating.keySet())
            System.out.println("Key : " + key + " Value : " + moviesRating.get(key));

    }

    public static void collectToCollection(List<Movie> movies) {

        Set<Movie> movieList = movies.stream()
                .filter(movie -> movie.getRating() >= 4.5)
                .distinct()
                .collect(Collectors.toSet());

        System.out.println("List size " + movieList.size());
    }


    public static void reduce(List<Movie> movies) {


        movies.stream()
                .filter(movie -> movie.getRating() > 4.5)
                .reduce( (movieOne, movieTwo) -> movieOne.getDuration() <= movieTwo.getDuration() ? movieOne : movieTwo )
                .ifPresent( movie -> System.out.println("Shortest movie " + movie.getDuration()));
    }

    public static void overloadedReduction() {

        String[] letters = {"A","A","B"};

        String concat = Arrays.stream(letters)
                .reduce("",(s1,s2) -> s1 + s2);

    }


    public static void slice(List<Movie> movies) {

        List<String> moviesList =  movies.stream()
                .filter(movie -> movie.getRating() > 4)
                .skip(5)
                .map(movie -> movie.getName())
                .collect(Collectors.toList());

    }




    // Rating > 4.8 && Duration < 90

    public static void match(List<Movie> movies) {

        boolean allMatch = movies.stream()
                .noneMatch( movie -> movie.getRating() < 3);

        System.out.println("allMatch? : " + allMatch);
    }

    //findAny(expression)
    //findFirst()
    //Optional Class


    public static void find(List<Movie> movies) {

        Movie m = movies.stream()
                .filter(movie -> movie.getRating() > 4.8 && movie.getDuration() < 90)
                .findAny().orElseGet(Main::getDefault);
    }

    public static Movie getDefault() {

        Movie movie =  new Movie(
                -1,
                "Default Movie",
                4,
                94,
                "Netflix"
        );

        return movie;

    }

}



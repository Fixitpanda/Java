package com.javalecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieExtractor {


    private static Random rand = new Random();

    public static List<Movie> getMoviesFromAmazon(String keyword) {

        ArrayList<Movie> movies = new ArrayList<>();

        for (int i=0; i < 15; i++) {

            movies.add(new Movie(
                    i,
                    "Movie_" + i,
                    rand.nextInt(3) + 3,
                    rand.nextInt(60) + 61,
                    "Amazon")
            );
        }

        return movies;
    }


    public static List<Movie> getMoviesFromNetflix(String keyword) {

        ArrayList<Movie> movies = new ArrayList<>();

        for (int i=0; i < 30; i+=2) {

            movies.add(new Movie(
                    i,
                    "Movie_" + i,
                    rand.nextInt(3) + 3,
                    rand.nextInt(60) + 61,
                    "Netflix")
            );
        }

        return movies;
    }
}

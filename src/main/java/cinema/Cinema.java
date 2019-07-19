package main.java.cinema;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cinema {
    private List<Movie> movies = Arrays.asList(
                    new Movie("Terminator", "Action", 15),
                    new Movie("Avatar", "Action", 20),
                    new Movie("The Ring", "Horror", 10));
    private List<Movie> movies1 = Arrays.asList(
            new Movie("Avengers", "Action", 30),
            new Movie("The Nun", "Horror", 30),
            new Movie("Titanic", "Drama", 25));

    public void countAveragePrice() {
        Map<String, Double> collect = Stream.concat(this.movies.stream(), this.movies1.stream())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingInt(Movie::getPrice)));
        for (Map.Entry<String, Double> stringDoubleEntry : collect.entrySet()) {
            System.out.println("Genre: " + ((Map.Entry) stringDoubleEntry).getKey() + "; Average price: " + ((Map.Entry) stringDoubleEntry).getValue());
        }
    }

    public void countMoviesByGenre(String genre) {
        long count = movies.stream().
                        filter(Movie -> Movie.getGenre().toUpperCase()
                        .equals(genre.toUpperCase()))
                        .count() + movies1.stream()
                        .filter(Movie -> Movie.getGenre().toUpperCase()
                        .equals(genre.toUpperCase()))
                        .count();
        System.out.println("In the cinema there are: " + count + " movies in genre \"" + genre + "\"");
    }
}

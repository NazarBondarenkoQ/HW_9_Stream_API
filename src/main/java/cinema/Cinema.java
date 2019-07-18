package main.java.cinema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>(Arrays.asList(new Movie("Terminator", "Action", 15),
            new Movie("Avatar", "Action", 20),
            new Movie("The Ring", "Horror", 10)));
    private List<Movie> premiers = new ArrayList<>(Arrays.asList(new Movie("Avengers", "Action", 30),
            new Movie("The Nun", "Horror", 30),
            new Movie("Titanic", "Drama", 25.5)));

    public void countAveragePrice() {
        double sum = (movies.stream().
                mapToDouble(Movie::getPrice).
                sum() +
                premiers.stream().
                        mapToDouble(Movie::getPrice).
                        sum());
        System.out.println("Average price of all available movies is: " + (sum / 2));
    }

    public void countMoviesByGenre(String genre) {
        long count = movies.stream().
                filter(Movie -> Movie.getGenre().toUpperCase().
                        equals(genre.toUpperCase())).
                count() +
                premiers.stream().
                        filter(Movie -> Movie.getGenre().toUpperCase().
                                equals(genre.toUpperCase())).
                        count();
        System.out.println("In the cinema there are: " + count + " movies in genre \"" + genre + "\"");
    }
}

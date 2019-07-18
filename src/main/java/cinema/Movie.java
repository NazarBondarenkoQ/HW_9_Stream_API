package main.java.cinema;

class Movie {
    private String name;
    private String genre;
    private double price;

    Movie(String name, String genre, double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }


    String getGenre() {
        return genre;
    }

    double getPrice() {
        return price;
    }
}

package main.java.cinema;

class Movie {
    private String name;
    private String genre;
    private int ticketPrice;

    Movie(String name, String genre, int ticketPrice) {
        this.name = name;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    String getGenre() {
        return this.genre;
    }

    int getPrice() {
        return this.ticketPrice;
    }
}


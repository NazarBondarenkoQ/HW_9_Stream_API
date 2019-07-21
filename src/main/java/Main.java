package main.java;

import main.java.boxes.Box;
import main.java.cinema.Cinema;
import main.java.users.UserList;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        UserList userList = new UserList();
        Box box = new Box();
        cinema.countAveragePrice();
        cinema.countMoviesByGenre("Action");
        userList.groupUsersByLogin();
        box.protectFragileItems();
    }
}

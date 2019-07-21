package main.java.users;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class UserList {

    private List<User> users = new ArrayList<>(Arrays.asList(
            new User("example@gmail.com ", LocalDate.of(2019, 7, 17), Teams.TEAM1),
            new User("pluuuub@gmail.com ", LocalDate.of(2019, 7, 17), Teams.TEAM1),
            new User("cocacola@gmail.com ", LocalDate.of(2019, 7, 3), Teams.TEAM2),
            new User("iamthebest@gmail.com ", LocalDate.of(2019, 7, 15), Teams.TEAM3),
            new User("fluffy@gmail.com ", LocalDate.of(2019, 6, 17), Teams.TEAM1)));

    public void groupUsersByLogin() {
        Map<String, String> collect = users.stream().
                filter(user -> user.getLoginTime().
                        isAfter(LocalDate.now().minusDays(7)))
                .collect(Collectors.
                        toMap(User::getTeamName, User::getEmail, (k, v) -> k + v));
        System.out.println("Users logged in later than week ago: ");
        for (Map.Entry<String, String> stringStringEntry : collect.entrySet()) {
            System.out.println("Email: " + ((Map.Entry) stringStringEntry).getValue() + " " +
                    "Team: \"" + ((Map.Entry) stringStringEntry).getKey()+"\"");
        }
    }
}

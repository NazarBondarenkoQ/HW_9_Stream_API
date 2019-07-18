package main.java.users;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginTime;
    private Teams team;

    public User(String email, LocalDate loginTime, Teams team) {
        this.email = email;
        this.loginTime = loginTime;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getLoginTime() {
        return loginTime;
    }

    public String getTeamName() {
        return team.getName();
    }
}

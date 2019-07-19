package main.java.users;

import java.time.LocalDate;

class User {
    private String email;
    private LocalDate loginTime;
    private Teams team;

    User(String email, LocalDate loginTime, Teams team) {
        this.email = email;
        this.loginTime = loginTime;
        this.team = team;
    }

    String getEmail() {
        return email;
    }

    LocalDate getLoginTime() {
        return loginTime;
    }

    String getTeamName() {
        return team.getName();
    }
}

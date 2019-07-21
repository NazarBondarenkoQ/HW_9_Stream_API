package main.java.users;

public enum Teams {
    TEAM1("Adepts of 42"), TEAM2("Prehistoric Dogs"), TEAM3("Vikings");

    private String name;

    Teams(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }
}

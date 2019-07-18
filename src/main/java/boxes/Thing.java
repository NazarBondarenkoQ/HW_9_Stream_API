package main.java.boxes;

public class Thing {
    private String name;
    private Conditions condition;

    public Thing(String name, Conditions condition) {
        this.name = name;
        this.condition = condition;
    }

    public Conditions getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }
}

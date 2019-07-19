package main.java.boxes;

class Thing {
    private String name;
    private Conditions condition;

    Thing(String name, Conditions condition) {
        this.name = name;
        this.condition = condition;
    }

    Conditions getCondition() {
        return condition;
    }

    String getName() {
        return name;
    }
}

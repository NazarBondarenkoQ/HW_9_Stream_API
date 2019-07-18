package main.java.boxes;

public class Protector {
    private Thing thing;

    public Protector(Thing thing) {
        this.thing = thing;
    }

    public String getThingName(){
        return thing.getName();
    }
}

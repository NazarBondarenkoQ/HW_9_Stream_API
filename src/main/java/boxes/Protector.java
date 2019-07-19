package main.java.boxes;

class Protector {
    private Thing thing;

    Protector(Thing thing) {
        this.thing = thing;
    }

    String getThingName(){
        return thing.getName();
    }
}

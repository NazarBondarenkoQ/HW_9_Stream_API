package main.java.boxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Box {
    private List<Thing> box1 = new ArrayList<>(Arrays.asList(new Thing("Rock", Conditions.DURABLE),
            new Thing("Glass", Conditions.FRAGILE),
            new Thing("Bottle", Conditions.DURABLE),
            new Thing("Vase", Conditions.FRAGILE),
            new Thing("Laptop", Conditions.DURABLE)));
    private List<Thing> box2 = new ArrayList<>(Arrays.asList(new Thing("Paper", Conditions.DURABLE),
            new Thing("Plate", Conditions.FRAGILE),
            new Thing("Knife", Conditions.DURABLE),
            new Thing("Sneakers", Conditions.DURABLE),
            new Thing("Phone", Conditions.DURABLE)));
    private ArrayList<ArrayList<Thing>> boxes = new ArrayList<>();

    public Box() {
        boxes.add((ArrayList<Thing>) box1);
        boxes.add((ArrayList<Thing>) box2);
    }

    public void protectFragileItems() {
        List<Protector> collect = boxes.stream()
                .flatMap((box) -> box.stream()
                        .filter(Thing -> Thing.getCondition() == Conditions.FRAGILE)
                        .map(Protector::new)).collect(Collectors.toList());
        System.out.print("List of protected items: [ ");
        for (Protector protector : collect) {
            System.out.print(protector.getThingName() + " ");
        }
        System.out.println("]");
    }
}

package main.java.functional;

public class Main {
    public static void main(String[] args) {
      MyInterface myInterface = (a, b) -> a * b;
        System.out.println(myInterface.multiply(10,15));
    }
}

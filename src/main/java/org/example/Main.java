package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Outter().x);
        Outter.NestedStatic nestedStatic = new Outter.NestedStatic();
        Outter.Inner inner = new Outter().new Inner();

        Car familyCar = new FamilyCar("VIN");
        familyCar.getSpeed();
        familyCar.getNoOfSeats();
        familyCar.getWeight();
    }
}
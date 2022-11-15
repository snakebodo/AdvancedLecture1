package org.example;

public class FamilyCar extends Car{

    public FamilyCar(String vin) {
        super(vin);
    }

    @Override
    void runEngine(String vin) {
        System.out.println("Run FamilyCarEngine");
    }

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public int getWeight() {
        return 50;
    }

    @Override
    public int getNoOfSeats() {
        return 0;
    }
}

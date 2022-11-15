package org.example;

public abstract class Car implements Vehicle {

    protected final String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }
//    public void setVin(){
//        vin = "test";
//    }

    abstract void runEngine(String vin);
}


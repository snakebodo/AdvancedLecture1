package org.example;

public class Truck implements Vehicle{
    @Override
    public int getSpeed() {
        return 75;
    }

    @Override
    public int getWeight() {
        return 10;
    }
}
//daca nu vrei sa implemetezi valorile atunci scrii abstract intre public si class
//Exemplu: public abstract class Truck
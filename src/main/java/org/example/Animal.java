package org.example;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }
}

class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "Lion Wrrr!";
    }
}


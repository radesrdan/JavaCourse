package com.udemy.Inheritance;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat () {
        System.out.println("animal.eat() executed");
    }

    public void move(int speedKMph) {
        System.out.println("Animal is moving at " + speedKMph + "KM/h");
    }




    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

}

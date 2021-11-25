package com.udemy.Inheritance;

public class Dog extends Animal{

    private int numberOfTeeth;
    private int numberOfLegs;
    private int numberOfEyes;
    private int numberOfTails;
    private String coat;

    public Dog( int size, int weight, String name, int numberOfTeeth, int numberOfLegs, int numberOfEyes, int numberOfTails, String coat) {
        super(1, 1, size, weight, name);
        this.coat = coat;
        this.numberOfEyes = numberOfEyes;
        this.numberOfTeeth = numberOfTeeth;
        this.numberOfLegs = numberOfLegs;
        this.numberOfTails = numberOfTails;
    }

    // with chew, we want to override the animal.eat() method
    public void chew() {
        System.out.println("Dog.chew() executed");
    }

    public void walk() {
        System.out.println("Dog.walk() executed");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() executed");
        move(14);
    }

    @Override
    public void eat() {
        System.out.println("animal.eat() executed");
        chew();
        super.eat();
    }
}

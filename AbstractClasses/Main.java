package com.udemy.AbstractClasses;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Shiba Inu");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Mackoo Parrot");
        parrot.eat();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Austraian Penguin");
        penguin.fly();

    }
}

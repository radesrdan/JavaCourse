package com.udemy.AbstractClasses;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("can't fly, i will just got for a swim");
    }





}

package com.example.finalfield;

public class RandomClass {

    public final int instanceNumber;
    private static int classCounter = 0;
    private final String name;

    //sample of a constant variable, we are not storing copies because it is static, and the variable is immutable because it is final
    private static final int constantNumber = 3;

    public RandomClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is "+ instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

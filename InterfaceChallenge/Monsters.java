package com.udemy.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISavable {
    private String name;
    private String strength;

    public Monsters(String name, String strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", strength='" + strength + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,this.strength);


        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.strength = savedValues.get(1);
        }

    }
}

package com.udemy.AutoBoxingvsUnBoxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];
        // Array lists can't take primitive data types, we would need an IntClass in this scenario, they need autoboxing aka wrappers
        //ArrayList<int> integer = new ArrayList<int>();

        ArrayList<Integer> integer = new ArrayList<Integer>();
        ArrayList<IntClass> integerArrayList = new ArrayList<IntClass>();
        integerArrayList.add(new IntClass(54));

        for (int i = 0;i<= 10; i++) {
            integer.add(i);
        }
        for (int i = 0;i<= 10; i++) {
            System.out.println(i + ". ---> " + integer.get(i).intValue());
        }


    }
}

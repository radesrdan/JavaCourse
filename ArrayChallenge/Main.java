package com.udemy.ArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int [] values = new int[number];

        for (int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArrays(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println("Element " + array[i] + " assigned to index position " + i);
        }
    }

    public static int[] sortArrayDescending(int[] array){
        int arrayLength = array.length;
        for (int i=0;i<arrayLength-1;i++){
            for (int x=0;x<array.length-1;x++) {
                int currentValue = array[x];
                if (array[x] < array[x+1]){
                    int tempValue = array[x];
                    array[x] = array[x+1];
                    array[x+1] = tempValue;
                }
            }
        }
        printArrays(array);
        return array;
    }

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        sortArrayDescending(array);
    }
}

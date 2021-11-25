package com.udemy.EvenDigitSum;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number 123456789 -> " + getEvenDigitSum(123456789));
        System.out.println("Number 252 -> " + getEvenDigitSum(252));
        System.out.println("Number -22 -> " + getEvenDigitSum(-22));
        System.out.println("Number 333 -> " + getEvenDigitSum(33));
    }



    public static int getEvenDigitSum(int number) {
        int tempNumber = 0;
        int finalSum = 0;

        if (number < 0) {
            return -1;
        }
        // keeps iterating through the digit until we reach most-significant digit.... aka the first digit
        while (number != 0) {
            //gets the final even value of a digit... aka least-significant
            tempNumber = number % 10;
            if (tempNumber % 2 == 0){
                finalSum += tempNumber;
            }
            number /= 10; // same as number = number / 10, iterates to the next digit
        }
        return finalSum;
    }
}
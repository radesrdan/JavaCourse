package com.udemy.FirstAndLastDigitSum;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number 252 -> " + sumOfDigits(252));
        System.out.println("Number 257 -> " + sumOfDigits(257));
        System.out.println("Number 9 -> " + sumOfDigits(9));
        System.out.println("Number 0 -> " + sumOfDigits(0));
        System.out.println("Number 5 -> " + sumOfDigits(5));
        System.out.println("Number -10 -> " + sumOfDigits(-10));
    }
    


    public static int sumOfDigits(int number) {
        

        int sumOfFinalDigits = 0;
        
        if (number < 0) {
            return -1;
        }
        //gets the final value of a digit... aka least-significant
        sumOfFinalDigits = number % 10;
        // keeps iterating through the digit until we reach most-significant digit.... aka the first digit
        while (number > 9) {
            number /= 10; // same as number = number / 10
        }
        return sumOfFinalDigits + number;
    }
}
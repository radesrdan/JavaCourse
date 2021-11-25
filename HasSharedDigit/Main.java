package com.udemy.HasSharedDigit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number 12,23 -> " + hasSharedDigit(12,23));
        System.out.println("Number 9,99 -> " + hasSharedDigit(9,99));
        System.out.println("Number 15,55 -> " + hasSharedDigit(15,55));
    }

    /***
     *
     * @param firstNumber int data type
     * @param secondNumber int data type
     * @return a boolean result is one of the digits in firstNumber appears in secondNumber or vice-versa
     */
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if((firstNumber > 99) || (firstNumber < 10) || (secondNumber > 99) || (secondNumber < 10)) {
            return false;
        }else {
            return((firstNumber/10 == secondNumber/10)||(firstNumber/10 == secondNumber % 10)
                    ||(secondNumber/10 == firstNumber % 10)||(firstNumber%10 == secondNumber%10));
        }
    }
}
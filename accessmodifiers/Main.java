package com.example.accessmodifiers;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account("RA-22341");
        acc.addDeposit(20);
        acc.addDeposit(20);
        acc.addDeposit(20);
        acc.withdraw(20);
        acc.calculateBalance();

    }
}

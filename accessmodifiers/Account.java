package com.example.accessmodifiers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Account {
    public String accName;
    public int balance = 0;
    // change from public to private access modifier to prevent acc.transaction.add() in main class
    private ArrayList<Integer> transactions;

    public Account(String accName) {
        this.accName = accName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void addDeposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            balance += amount;
            System.out.println(amount + " has been deposited now, the balance is: " + this.balance);
        } else {
            System.out.println("Can not deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            transactions.add(-amount);
            balance += -amount;
            System.out.println(amount + " has been withdrawn now, the balance is: " + this.balance);
        } else {
            System.out.println("Please pass a positive number");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (int i: transactions) {
            this.balance += i;

        }
        System.out.println("The balance is " + this.balance);
    }
}

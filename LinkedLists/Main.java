package com.udemy.LinkedLists;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 66.32);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getBalance() + ", name: " + customer.getName());
    }
}

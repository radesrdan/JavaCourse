package com.udemy.AutoboxingvsUnboxingChallenge;

import java.util.ArrayList;

public class Branches {

    private ArrayList<Customer> customers;
    private String branchName;

    public Branches(String branchName) {
        this.customers = new ArrayList<Customer>();
        this.branchName = branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName,initialAmount));
            System.out.println("Customer " + customerName + " successfully added!");
            return true;
        }
        System.out.println("Customer could not be added");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransactions(amount);
            System.out.println("Transaction with the amount "+ amount + " has been added.");
            return true;
        }
        System.out.println("Transaction with the amount "+ amount + " could not be added.");
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i=0; i<this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(name)){
                return this.customers.get(i);
            }
        }
        return null;
    }






}

package com.udemy.AutoboxingvsUnboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branches> bankBranches;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranches = new ArrayList<Branches>();
    }

    public boolean addBranch (String branchName) {
        if (findBranchName(branchName) == null) {
            this.bankBranches.add(new Branches(branchName));
            System.out.println("Branch " + branchName + " has been successfully added.");
            return true;
        }
        System.out.println("Branch " + branchName + " could not be added.");
        return false;
    }

    private Branches findBranchName(String name) {
        for (int i = 0; i < this.bankBranches.size(); i++) {
            if (this.bankBranches.get(i).getBranchName().equals(name)) {
                return this.bankBranches.get(i);
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branches branch = findBranchName(branchName);

        if (branchName != null) {
            return branch.addNewCustomer(customerName,initialAmount);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branches branch = findBranchName(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    // Show a list of customers for a particular branch and optionally a list of their transactions
    public boolean listCustomers (String branchName, boolean showTransactions) {
        Branches branch = findBranchName(branchName);
        if (branch != null) {
            System.out.println("Customers for branch: " + branchName);
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++ ) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i+1)+". Customer: " + branchCustomer.getName());
                if (showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int x=0;x<transactions.size();x++) {
                        System.out.println((x+1) + " Transaction " + transactions.get(x));
                    }
                }
            }
        } else {
            return true;
        }
        return false;
    }
    }

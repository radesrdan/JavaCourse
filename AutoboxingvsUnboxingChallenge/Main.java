package com.udemy.AutoboxingvsUnboxingChallenge;

public class Main {



    public static void main(String[] args) {

        Bank bank = new Bank("Raiffeisen  Bank");

        bank.addBranch("Budapest");
        bank.addCustomer("Budapest","Rade ",1200.34);
        bank.addCustomer("Budapest","John ",1530.12);
        bank.addCustomer("Budapest","Mathew ",1273.52);
        bank.addCustomer("Budapest","Austin ",1254.23);

        bank.addBranch("Debrecen");
        bank.addCustomer("Debrecen","Greg ",14351.22);
        bank.addCustomer("Debrecen","Mark ",153221.36);


        bank.addCustomerTransaction("Budapest","Rade",450.21);
        bank.addCustomerTransaction("Budapest","Rade",4120.22);
        bank.addCustomerTransaction("Budapest","Rade",500.86);

        bank.listCustomers("Budapest",true);
    }
}

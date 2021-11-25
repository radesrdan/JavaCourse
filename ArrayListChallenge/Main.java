package com.udemy.ArrayListChallenge;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner (System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {


        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }


    }

    private static void addNewContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the contacts number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContacts = Contacts.addPhoneNumber(name,phoneNumber);
        if (mobilePhone.addNewContact(newContacts)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phoneNumber);
        } else {
            System.out.println("The phone number could not be added.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.qureyContactName(oldName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String number = scanner.nextLine();

        Contacts newContact = Contacts.addPhoneNumber(newName,number);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully made the changes.");
        } else {
            System.out.println("Unsuccessful, the changes were not made.");
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.qureyContactName(oldName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully removed the contact.");
        } else {
            System.out.println("Unsuccessful, the contact could not be removed.");
        }

    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.qureyContactName(oldName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", phone number: " +existingContactRecord.getPhoneNumber());
    }



    private static void startPhone () {
        System.out.println("Starting phone....");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
 }

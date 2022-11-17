package com.javalecture;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner;
    public static PhoneBook phoneBook;


    public static void main (String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        phoneBook = new PhoneBook(contacts);
        scanner = new Scanner(System.in);

        boolean shutdown = false;

        printActions();

        while (shutdown != true) {

            System.out.println("\n You can always press 6 in order to get back to the Menu..");
            System.out.println("\n Select your action: ");

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {

                case 0 -> shutdown = true;
                case 1 -> phoneBook.printContactList();
                case 2 -> phoneBook.addContact(getNewContactDetailsFromUser());
                case 3 -> {
                    Contact oldContact = findContactByPhoneNumber();
                    Contact newContact = getNewContactDetailsFromUser();
                    phoneBook.updateContact(oldContact,newContact);
                }
                case 4 -> System.out.println(findContactByPhoneNumber());
                case 5 -> phoneBook.sortByFirstName();
                case 6 -> printActions();

            }
        }


    }

    private static void printActions() {

        System.out.println("\nPlease select one of the available actions: ");
        System.out.println(
                "0 - to shutdown the application\n" +
                        "1 - to print phonebook\n" +
                        "2 - to add new contact\n" +
                        "3 - to update a contact\n" +
                        "4 - to find contact by phone number\n" +
                        "5 - to sort phonebook\n" +
                        "6 - to show this menu again"
        );

        System.out.println("Choose your action : ");
    }

    private static Contact getNewContactDetailsFromUser() {

        System.out.println("Please enter new Contact name : ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter new Contact lastname : ");
        String lastName = scanner.nextLine();

        System.out.println("Enter new contact address : ");
        String address = scanner.nextLine();

        System.out.println("Enter new contact phone number : ");
        String phoneNumber = scanner.nextLine();

        return new Contact(firstName,lastName,address,phoneNumber);
    }

    private static Contact findContactByPhoneNumber() {

        System.out.println("Please enter phone number of existing contact : ");
        String phoneNumber = scanner.nextLine();

        try {
            Contact oldContact = phoneBook.findContactByPhoneNumber(phoneNumber);
            return oldContact;
        } catch (NullPointerException e) {
            System.out.println("Contact with that number doesn't exists!");
        }

        return null;

    }



}

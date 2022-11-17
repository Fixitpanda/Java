package com.javalecture;

import java.util.List;

public class PhoneBook {

    protected List<Contact> contacts;

    public PhoneBook(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public boolean addContact(Contact newContact) {

        if (isContactExists(newContact)) {
            System.out.println("Contact already exists!");
            return false;
        }

        return contacts.add(newContact);
    }

    public boolean isContactExists(Contact contact) {
        return contacts.contains(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int contactIndex = getContactIndex(oldContact);

        if (contactIndex < 0) {
            System.out.println("Contact was not found!");
            return false;
        }

        contacts.set(contactIndex, newContact);
        return true;

    }

    private int getContactIndex(Contact contact) {
        return contacts.indexOf(contact);
    }

    public void printContactList() {
        System.out.println(this);
    }

    public Contact findContactByPhoneNumber(String phoneNumber) {

        for (Contact contact : contacts)
            if (contact.getPhoneNumber().equals(phoneNumber))
                return contact;

        throw new NullPointerException();
    }

    public void sortByFirstName() {

        contacts.sort( (Contact c1, Contact c2) -> {
            return c1.getFirstName().compareTo(c2.getFirstName());
        });
    }

    @Override
    public String toString() {

        String toString = "************************** PhoneBook Contacts *********************************\n\n";

        for (Contact contact : this.contacts)
            toString += contact.toString() + "\n\n";

        toString += "****************************************************************************************";

        return toString;
    }
}

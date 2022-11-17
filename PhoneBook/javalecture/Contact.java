package com.javalecture;

public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Contact(){}

    public Contact(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Contact Name : " + this.firstName + " " + this.lastName + "\n" + "Contact Phone number : " + this.phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {

        boolean isEqual = false;

        if (obj instanceof Contact) {
            isEqual = ((Contact)obj).phoneNumber == this.phoneNumber;
        }

        return isEqual;
    }
}

package com.javalecture.actors;

import com.javalecture.enums.EGender;

public abstract class Person {

    private String firstName;
    private String lastName;
    private EGender gender;

    public Person(){}

    public Person(String firstName, String lastName, EGender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public EGender getGender() {
        return gender;
    }
}

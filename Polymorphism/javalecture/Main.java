package com.javalecture;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        Animal[] animals = new Animal[] {dog,cat,bird};

        for (Animal animal : animals)
            animal.makeSound();

    }

}

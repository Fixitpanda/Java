package com.javalecture;

public class Pizza {

    protected Size pizzaSize;
    public String color;

    public Pizza(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza() {

        switch (this.pizzaSize) {
            case SMALL -> System.out.println("You made an order for a small Pizza!");
            case MEDIUM -> System.out.println("You made an order for a medium Pizza!");
            case LARGE -> System.out.println("You made an order for a large Pizza!");
            case EXTRA_LARGE -> System.out.println("You made an order for an extra large Pizza!");
        }
    }
}

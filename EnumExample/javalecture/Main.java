package com.javalecture;

public class Main {

    public static void main(String[] args) {

        DaysOfTheWeek firstDay = DaysOfTheWeek.SUNDAY;

        for (DaysOfTheWeek day : DaysOfTheWeek.values())
            System.out.println(day);
    }

}

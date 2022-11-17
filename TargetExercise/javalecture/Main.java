package com.javalecture;

public class Main {

    public static void main (String[] args) {

        Sum s = new Sum();

        int[] indexes = s.findSum(new int[] {2,7,11,15}, 9);

        System.out.println(indexes[0] + " " + indexes[1]);

    }


}

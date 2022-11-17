package com.javalecture;

public class Main {

    public static void main(String[] args) {

        Camera galaxy = new Smartphone();
        GPS iphone = new Smartphone();
        Smartphone xiaomi = new Smartphone();

        galaxy.stopCamera();
        iphone.getCoordinates();

        xiaomi.getCoordinates();
        xiaomi.startCamera();
        xiaomi.stopCamera();

    }

}

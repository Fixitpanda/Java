package com.javalecture;

public class Smartphone implements Camera, GPS {

    private boolean isCameraOn;

    @Override
    public void takePhoto() {
        System.out.println("Taking photo....");
    }

    @Override
    public void startCamera() {
        this.isCameraOn = true;
    }

    @Override
    public void stopCamera() {
        this.isCameraOn = false;
    }

    @Override
    public float[] getCoordinates() {
        return new float[] {123.456f, -231.14f};
    }

}

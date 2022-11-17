package com.javalecture.enums;

public enum EPassengerList {

    CONFIRMED(7),
    WAITING(3);

    private int sizeLimit;

    EPassengerList(int sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    public int getSizeLimit() {
        return sizeLimit;
    }
}

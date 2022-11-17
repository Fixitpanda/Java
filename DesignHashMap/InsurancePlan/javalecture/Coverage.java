package com.javalecture;

public enum Coverage {

    PLATINUM(0.9),
    GOLD(0.7),
    SILVER(0.6);

    private double coverage;

    Coverage(double coverage) {
        this.coverage = coverage;
    }

    public double getCoverage() {
        return this.coverage;
    }
}

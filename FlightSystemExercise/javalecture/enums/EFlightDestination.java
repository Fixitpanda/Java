package com.javalecture.enums;

import java.time.Duration;

public enum EFlightDestination {

    NYC("LY001", Duration.ofHours(12)),
    PAR("LY325",Duration.ofHours(5)),
    BKK("LY1075",Duration.ofHours(11));

    private String flightNumber;
    private Duration flightDuration;

    EFlightDestination(String flightNumber,Duration flightDuration){
        this.flightNumber = flightNumber;
        this.flightDuration = flightDuration;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Duration getFlightDuration() {
        return flightDuration;
    }
}

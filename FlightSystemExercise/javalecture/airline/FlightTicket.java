package com.javalecture.airline;

import java.time.Duration;

public class FlightTicket {

    private String flightNumber;
    private String confirmationNumber;
    private Duration flightDuration;

    public FlightTicket() {}
    public FlightTicket(String flightNumber, String confirmationNumber, Duration flightDuration) {
        this.flightNumber = flightNumber;
        this.confirmationNumber = confirmationNumber;
        this.flightDuration = flightDuration;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public Duration getFlightDuration() {
        return flightDuration;
    }
}

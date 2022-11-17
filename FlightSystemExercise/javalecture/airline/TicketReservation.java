package com.javalecture.airline;

import com.javalecture.actors.Passenger;
import com.javalecture.enums.EPassengerList;
import com.javalecture.utils.FlightSystemUtils;

import java.util.*;

public class TicketReservation {

    //List of approved passengers
    private List<Passenger> confirmedList;

    //Waiting list of passengers
    private Deque<Passenger> waitingList;

    public TicketReservation() {

        confirmedList = new ArrayList<>();
        waitingList = new ArrayDeque<>();
    }

    public List<Passenger> getConfirmedList() {
        return confirmedList;
    }

    public Deque<Passenger> getWaitingList() {
        return waitingList;
    }

    public boolean bookFlight(Passenger passenger) {

        //If passenger already exists in one of those list, then return false
        if (confirmedList.contains(passenger) || waitingList.contains(passenger)) {

            System.out.println("Passenger already exists!");
            return false;
        }

        //If both lists are full, return false
        else if (confirmedList.size() == EPassengerList.CONFIRMED.getSizeLimit() &&
                 waitingList.size() == EPassengerList.WAITING.getSizeLimit()) {

            System.out.println("We apologize, both lists are full.");

            return false;
        }

        // Add passenger to the waiting list, if confirmed list is full
        else if (confirmedList.size() == EPassengerList.CONFIRMED.getSizeLimit()) {

            System.out.println("Passenger was added to the waiting list...");

            waitingList.offer(passenger);
        }

        //Add passenger to the confirmed list
        else {
            confirmedList.add(passenger);
            System.out.println("Passenger was added successfully to the confirmed list...");
        }

        // Generates new Flight Ticket
        passenger.setFlightTicket(
                FlightSystemUtils.generateFlightTicket(passenger.getFlightDestination())
        );

        return true;
    }

    public boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {

        //Looping through the list
        while (iterator.hasNext())

            if (iterator.next()
                    .getFlightTicket()
                    .getConfirmationNumber()
                    .equals(confirmationNumber))
            {
                iterator.remove();
                return true;
            }

        return false;
    }


    // Cancel method will cancel passenger reservation,
    // If passenger exists in one of the lists
    public boolean cancel(String confirmationNumber) {

        // If passenger exists in confirmed list
        if (removePassenger(confirmedList.iterator(), confirmationNumber))

            // Check if waiting list is not empty, and poll passenger from Head of the waiting list
            return waitingList.isEmpty() ? true : confirmedList.add(waitingList.poll());

        // If passenger is not in confirmed list, then check if he's in the waiting list, and remove him.
        return removePassenger(waitingList.iterator(), confirmationNumber);
    }
}

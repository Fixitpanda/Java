package com.javalecture.utils;

import com.javalecture.actors.Passenger;
import com.javalecture.airline.FlightTicket;
import com.javalecture.enums.EFlightDestination;
import com.javalecture.enums.EGender;
import com.javalecture.enums.ESeatClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FlightSystemUtils {


    //Holding the path to the Passenger file
    private static final String PASSENGERS_FILE_PATH = "src\\resources\\Passengers.txt";


    //Generates flight ticket based on Passenger info
    public static FlightTicket generateFlightTicket(EFlightDestination flightDestination) {

        return new FlightTicket(
            flightDestination.getFlightNumber(),
            UUID.randomUUID().toString(),
            flightDestination.getFlightDuration()
        );

    }


    public static List<Passenger> parsePassengersFile() throws FileNotFoundException {

        List<Passenger> passengerList = new ArrayList<>();

        String[] passengersLines = IOUtils.read(new FileInputStream(PASSENGERS_FILE_PATH)).split("\n");

        for (String line : passengersLines) {

            String[] variables = line.split("\t");

            passengerList.add(new Passenger(

                    //firstName
                    variables[0],
                    //lastName
                    variables[1],
                    //Flight destination
                    EFlightDestination.valueOf(variables[2]),
                    //Flight Gender
                    EGender.valueOf(variables[3]),
                    //Seat Class
                    ESeatClass.valueOf(variables[4])
            ));
        }

        return passengerList;
    }

}

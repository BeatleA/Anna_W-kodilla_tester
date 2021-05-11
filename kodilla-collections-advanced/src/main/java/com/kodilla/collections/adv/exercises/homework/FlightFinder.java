package com.kodilla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> flights = new LinkedList<>();
        for (Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getDeparture().equals(departure)){
                flights.add(flight);
            }
        }
        return flights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights = new LinkedList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                flights.add(flight);
            }
        }
        return flights;
    }
}

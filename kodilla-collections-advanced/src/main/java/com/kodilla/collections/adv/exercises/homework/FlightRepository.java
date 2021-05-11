package com.kodilla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flightsTable = new LinkedList<>(List.of(
        new Flight("Gdansk", "London Luton"),
        new Flight("London Luton", "Gdansk"),
        new Flight("Vilnius", "London Luton")
    ));

    public static List<Flight> getFlightsTable(){
        return flightsTable;
    }
}

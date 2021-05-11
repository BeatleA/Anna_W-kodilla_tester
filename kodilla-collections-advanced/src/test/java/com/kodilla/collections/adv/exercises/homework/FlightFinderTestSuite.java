package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom_EmptyList(){
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Poznan");
        // then
        List<Flight> expectedList = new LinkedList<>();
        assertEquals(0, result.size());
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsFrom(){
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Gdansk");
        // then
        List<Flight> expectedList = new LinkedList<>();
        expectedList.add(new Flight("Gdansk", "London Luton"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo_EmptyList(){
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsTo("London Stansted");
        // then
        List<Flight> expectedList = new LinkedList<>();
        assertEquals(0, result.size());
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo(){
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsTo("London Luton");
        // then
        List<Flight> expectedList = new LinkedList<>();
        expectedList.add(new Flight("Gdansk", "London Luton"));
        expectedList.add(new Flight("Vilnius", "London Luton"));
        assertEquals(expectedList, result);
    }
}
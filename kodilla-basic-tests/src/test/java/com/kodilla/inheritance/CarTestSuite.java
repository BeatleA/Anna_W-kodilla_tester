package com.kodilla.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CarTestSuite {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void shouldHaveFourDoorsAndFiveSeats() {
        // Given
        Car car = new Convertible(4,5);
        // When
        int wheels = car.getWheels();
        int seats = car.getSeats();
        // Then
        assertEquals(4, wheels);
        assertEquals(5, seats);
    }

    @Test
    public void shouldTurnLightsOn() {
        // Given
        Car car = new Convertible(4,2);
        // When
        car.turnOnLights();
        // Then
        assertEquals("Lights were turned on", outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldOpenDoors() {
        // Given
        Car car = new Convertible(4,5);
        // When
        car.openDoors();
        // Then
        assertEquals("Opening 2 doors", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
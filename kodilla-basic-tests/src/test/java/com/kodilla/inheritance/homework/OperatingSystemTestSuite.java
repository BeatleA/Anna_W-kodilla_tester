package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTestSuite {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void shouldTurnSystemOn() {
        // Given
        OperatingSystem system = new OperatingSystem(2015);
        // When
        system.turnOn();
        // Then
        assertEquals("Operating system was turned on", outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldTurnWindowsOn() {
        // Given
        OperatingSystem windows = new Windows(2015);
        // When
        windows.turnOn();
        // Then
        assertEquals("Windows operating system was turned on", outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldTurnLinuxOff() {
        // Given
        OperatingSystem linux = new Linux(2015);
        // When
        linux.turnOff();
        // Then
        assertEquals("Linux operating system was turned off", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
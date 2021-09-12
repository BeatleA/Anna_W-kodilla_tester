package com.kodilla.inheritance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ConvertibleTestSuite {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void shouldOpenRoof() {
        // Given
        Convertible convertible = new Convertible(4,2);
        // When
        convertible.openRoof();
        // Then
        assertEquals("Opening roof...", outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldCloseRoof() {
        // Given
        Convertible convertible = new Convertible(4,2);
        // When
        convertible.closeRoof();
        // Then
        assertEquals("Closing roof...", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
package com.kodilla.abstracts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalProcessorTestSuite {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void shouldDisplayCorrectDogInformation() {
        //Given
        Animal dog = new Dog();
        AnimalProcessor animalProcessor = new AnimalProcessor();
        //When
        animalProcessor.process(dog);
        //Then
        assertEquals("Animal has 4 legs\r\nWoof woof", outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldDisplayCorrectDuckInformation() {
        //Given
        Animal duck = new Duck();
        AnimalProcessor animalProcessor = new AnimalProcessor();
        //When
        animalProcessor.process(duck);
        //Then
        assertEquals("Animal has 2 legs\r\nQuack", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
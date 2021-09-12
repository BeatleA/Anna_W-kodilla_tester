package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CarUtilsTestSuite {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void shouldCorrectlyDescribeToyota() {
        //Given
        Car toyota = new Toyota(10);
        //When
        CarUtils.describeCar(toyota);
        //Then
        assertEquals("-----------------------------\r\nCar make: Toyota\r\nCar speed: 10",
                outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldCorrectlyDescribeFord() {
        //Given
        Car ford = new Ford(20);
        //When
        CarUtils.describeCar(ford);
        //Then
        assertEquals("-----------------------------\r\nCar make: Ford\r\nCar speed: 20",
                outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldCorrectlyDescribeMercedes() {
        //Given
        Car mercedes = new Mercedes(30);
        //When
        CarUtils.describeCar(mercedes);
        //Then
        assertEquals("-----------------------------\r\nCar make: Mercedes\r\nCar speed: 30",
                outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
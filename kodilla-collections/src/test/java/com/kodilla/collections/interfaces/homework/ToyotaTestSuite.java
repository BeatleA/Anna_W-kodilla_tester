package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaTestSuite {
    
    @Test
    public void shouldCorrectlyReturnSpeed() {
        //Given
        Toyota toyota = new Toyota(10);
        //When
        int speed = toyota.getSpeed();
        //Then
        assertEquals(10, speed);
    }

    @Test
    public void shouldCorrectlyIncreaseSpeed() {
        //Given
        Toyota toyota = new Toyota(10);
        //When
        toyota.increaseSpeed();
        int speed = toyota.getSpeed();
        //Then
        assertEquals(16, speed);
    }

    @Test
    public void shouldCorrectlyDecreaseSpeed() {
        //Given
        Toyota toyota = new Toyota(10);
        //When
        toyota.decreaseSpeed();
        int speed = toyota.getSpeed();
        //Then
        assertEquals(5, speed);
    }
}
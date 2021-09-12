package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordTestSuite {

    @Test
    public void shouldCorrectlyReturnSpeed() {
        //Given
        Ford ford = new Ford(10);
        //When
        int speed = ford.getSpeed();
        //Then
        assertEquals(10, speed);
    }

    @Test
    public void shouldCorrectlyIncreaseSpeed() {
        //Given
        Ford ford = new Ford(10);
        //When
        ford.increaseSpeed();
        int speed = ford.getSpeed();
        //Then
        assertEquals(13, speed);
    }

    @Test
    public void shouldCorrectlyDecreaseSpeed() {
        //Given
        Ford ford = new Ford(10);
        //When
        ford.decreaseSpeed();
        int speed = ford.getSpeed();
        //Then
        assertEquals(8, speed);
    }
}
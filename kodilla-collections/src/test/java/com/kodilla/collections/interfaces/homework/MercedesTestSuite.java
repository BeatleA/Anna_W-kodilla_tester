package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercedesTestSuite {
    
    @Test
    public void shouldCorrectlyReturnSpeed() {
        //Given
        Mercedes mercedes = new Mercedes(10);
        //When
        int speed = mercedes.getSpeed();
        //Then
        assertEquals(10, speed);
    }

    @Test
    public void shouldCorrectlyIncreaseSpeed() {
        //Given
        Mercedes mercedes = new Mercedes(10);
        //When
        mercedes.increaseSpeed();
        int speed = mercedes.getSpeed();
        //Then
        assertEquals(20, speed);
    }

    @Test
    public void shouldCorrectlyDecreaseSpeed() {
        //Given
        Mercedes mercedes = new Mercedes(10);
        //When
        mercedes.decreaseSpeed();
        int speed = mercedes.getSpeed();
        //Then
        assertEquals(0, speed);
    }
}
package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StampTestSuite {

    @Test
    public void shouldCorrectlyReturnName() {
        //Given
        Stamp stamp = new Stamp("Penny Black",19,22,true);
        //When
        String name = stamp.getName();
        //Then
        assertEquals("Penny Black", name);
    }

    @Test
    public void shouldCorrectlyReturnWidth() {
        //Given
        Stamp stamp = new Stamp("Penny Black",19,22,true);
        //When
        double width = stamp.getWidth();
        //Then
        assertEquals(19, width);
    }

    @Test
    public void shouldCorrectlyReturnHeight() {
        //Given
        Stamp stamp = new Stamp("Penny Black",19,22,true);
        //When
        double height = stamp.getHeight();
        //Then
        assertEquals(22, height);
    }

    @Test
    public void shouldCorrectlyReturnWhetherMarked() {
        //Given
        Stamp stamp = new Stamp("Penny Black",19,22,true);
        //When
        boolean isMarked = stamp.isMarked();
        //Then
        assertTrue(isMarked);
    }
}
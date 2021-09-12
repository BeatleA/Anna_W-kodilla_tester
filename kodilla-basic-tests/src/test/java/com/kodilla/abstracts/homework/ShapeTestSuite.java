package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTestSuite
{
    @Test
    public void shouldCalculateCorrectArea() {
        // Given
        Shape square = new Square(4);
        // When
        double area = square.calculateArea();
        // Then
        assertEquals(16, area, 0.01);
    }

    @Test
    public void shouldCalculateCorrectPerimeter() {
        // Given
        int[] sides = {7, 5, 9};
        Shape triangle = new Triangle(sides);
        // When
        double area = triangle.calculatePerimeter();
        // Then
        assertEquals(21, area, 0.01);
    }
}
package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilsTestSuite {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void shouldCorrectlyDisplayCircleInfo() {
        //Given
        Shape circle = new Circle(5);
        //When
        ShapeUtils.displayShapeInfo(circle);
        //Then
        assertEquals("-----------------------------\r\nShape kind: Circle\r\nShape area: 78.54\r\n" +
                        "Shape perimeter: 31.42", outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldCorrectlyDisplaySquareInfo() {
        //Given
        Shape square = new Square(10);
        //When
        ShapeUtils.displayShapeInfo(square);
        //Then
        assertEquals("-----------------------------\r\nShape kind: Square\r\nShape area: 100.00\r\n" +
                "Shape perimeter: 40.00", outputStreamCaptor.toString().trim());
    }

    @Test
    public void shouldCorrectlyDisplayTriangleInfo() {
        //Given
        Shape triangle = new Triangle(6.0, 4.0, 7.211);
        //When
        ShapeUtils.displayShapeInfo(triangle);
        //Then
        assertEquals("-----------------------------\r\nShape kind: Triangle\r\nShape area: 12.00\r\n" +
                "Shape perimeter: 17.21", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
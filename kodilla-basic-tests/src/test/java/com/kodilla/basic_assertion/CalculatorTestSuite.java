package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int addResult = calculator.add(a, b);
        assertEquals(13, addResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(b, a);
        assertEquals(3, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);

        a = -5;
        squareResult = calculator.square(a);
        assertEquals(25, squareResult);

        a = 0;
        squareResult = calculator.square(a);
        assertEquals(0, squareResult);
    }
}

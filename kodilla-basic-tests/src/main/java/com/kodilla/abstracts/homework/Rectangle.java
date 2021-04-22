package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int shortSideLength, longSideLength;

    public Rectangle(int shortSideLength, int longSideLength) {
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;
    }

    @Override
    public double calculateArea() {
        return shortSideLength * longSideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (shortSideLength + longSideLength);
    }
}

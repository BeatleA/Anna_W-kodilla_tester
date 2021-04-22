package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int[] sides = new int[3];

    public Triangle(int[] sides){
        this.sides = sides;
    }

    @Override
    public double calculateArea() {
        // Heron's Formula
        double s = calculatePerimeter()/2;
        double area = s;
        for (int i = 0; i < 3; i++) {
            area = area * (s - sides[i]);
        }
        area = Math.sqrt(area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return sides[0] + sides[1] + sides[2];
    }
}

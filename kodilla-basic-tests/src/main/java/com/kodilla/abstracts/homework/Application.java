package com.kodilla.abstracts.homework;

import javax.naming.PartialResultException;

public class Application {
    public static void main(String[] args) {
        // Shape
        Square square = new Square(10);
        System.out.println("Square with side lenghts 10.");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        int[] sides = {3, 4, 5};
        Triangle triangle = new Triangle(sides);
        System.out.println("Triangle with side lengths 3, 4 and 5.");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println("Rectangle with side lengths 2 and 5.");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        //Job
        Job teacher = new Teacher(34000, "teaching students");
        Job builder = new Builder(42000, "building houses");
        Job doctor = new Doctor(57000, "treating patients");
        Person jane = new Person("Jane", 25, teacher);
        Person garry = new Person("Garry", 40, builder);
        Person ruth = new Person("Ruth", 55, doctor);
        System.out.println();
        jane.displayResponsibilities();
        garry.displayResponsibilities();
        ruth.displayResponsibilities();
    }
}

package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int addResult = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(13, addResult);
        if (correct) {
            System.out.println("Method add works as expected for numbers " + a + " and " + b);
        } else {
            System.out.println("Method add doesn't work as expected for numbers " + a + " and " + b);
        }

        int subtractResult = calculator.subtract(b, a);
        correct = ResultChecker.assertEquals(3, subtractResult);
        if (correct) {
            System.out.println("Method subtract works as expected for numbers " + b + " and " + a);
        } else {
            System.out.println("Method subtract doesn't work as expected for numbers " + b + " and " + a);
        }

        int squareResult = calculator.square(a);
        correct = ResultChecker.assertEquals(25, squareResult);
        if (correct) {
            System.out.println("Method square works as expected for number " + a);
        } else {
            System.out.println("Method square doesn't work as expected for number " + a);
        }
    }
}

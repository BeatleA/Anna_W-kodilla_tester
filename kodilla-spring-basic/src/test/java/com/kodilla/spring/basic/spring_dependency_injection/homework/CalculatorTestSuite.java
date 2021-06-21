package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectAddition(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(2.0, 3.0);
        assertEquals(5.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectSubtraction(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(6.0, 3.0);
        assertEquals(3.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectMultiplication(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(4.0, 3.0);
        assertEquals(12.0, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectDivision(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(6.0, 3.0);
        assertEquals(2.0, result, 0.01);
    }
}
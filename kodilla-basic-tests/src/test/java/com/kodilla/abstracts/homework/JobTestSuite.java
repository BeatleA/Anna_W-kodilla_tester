package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JobTestSuite {

    @Test
    public void shouldHaveCorrectSalary(){
        //Given
        Job teacher = new Teacher(30000, "teaching children");
        // When
        double salary = teacher.getSalary();
        // Then
        assertEquals(30000, salary, 0.01);
    }

    @Test
    public void shouldHaveCorrectDescription(){
        // Given
        Job builder = new Builder(35000, "building houses");
        // When
        String responsibilities = builder.getResponsibilities();
        // Then
        assertEquals("building houses", responsibilities);
    }
}
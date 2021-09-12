package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestSuite {
    Student student;

    @Test
    public void shouldReturnCorrectFirstname() {
        // Given
        student = new Student("Mary", "Jones");
        // When
        String firstname = student.getFirstname();
        // Then
        assertEquals("Mary", firstname);
    }

    @Test
    public void shouldReturnCorrectLastname() {
        // Given
        student = new Student("Mary", "Jones");
        // When
        String lastname = student.getLastname();
        // Then
        assertEquals("Jones", lastname);
    }
}
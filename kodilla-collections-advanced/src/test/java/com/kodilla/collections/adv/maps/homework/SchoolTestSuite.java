package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTestSuite {

    @Test
    public void shouldReturnCorrectNumberOfStudents() {
        // Given
        School school = new School("St Christopher's", 30, 29, 25, 30, 27);
        // When
        int numberOfStudents = school.getNumberOfStudents();
        // Then
        assertEquals(141, numberOfStudents);
    }
}
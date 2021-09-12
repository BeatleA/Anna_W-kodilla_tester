package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {
    Grades grades;

    @Test
    public void shouldReturnCorrectAverage() {
        // Given
        grades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);
        // When
        double average = grades.getAverage();
        // Then
        assertEquals(4.7, average, 0.01);
    }
}
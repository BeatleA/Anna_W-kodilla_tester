package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTestSuite {
    Task task;

    @Test
    public void shouldReturnCorrectTaskTitle() {
        // Given
        task = Task.of("Writing tests", 40);
        // When
        String title = task.getTitle();
        // Then
        assertEquals("Writing tests", title);
    }

    @Test
    public void shouldReturnCorrectTaskDuration() {
        // Given
        task = Task.of("Writing tests", 40);
        // When
        int duration = task.getDuration();
        // Then
        assertEquals(40, duration);
    }
}
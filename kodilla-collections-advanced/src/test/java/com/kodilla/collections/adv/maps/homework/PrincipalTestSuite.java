package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTestSuite {

    @Test
    public void shouldReturnCorrectName() {
        // Given
        Principal principal = new Principal("Rose May");
        // When
        String name = principal.getName();
        // Then
        assertEquals("Rose May", name);
    }
}
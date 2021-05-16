package com.kodilla.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withException() throws AirportNotFoundException {

        assertThrows(AirportNotFoundException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                AirportRepository airportRepository = new AirportRepository();
                boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
            }
        });
    }
}
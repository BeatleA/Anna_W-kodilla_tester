package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validUserNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnHowManyWins(int n1, int n2, int n3, int n4, int n5, int n6) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        Integer[] expectedNumberOfWins = {0, 1, 2, 3, 4, 5, 6};
        userNumbers.add(n1);
        userNumbers.add(n2);
        userNumbers.add(n3);
        userNumbers.add(n4);
        userNumbers.add(n5);
        userNumbers.add(n6);
        int actualNumberOfWins = machine.howManyWins(userNumbers);
        assertTrue(Arrays.asList(expectedNumberOfWins).contains(actualNumberOfWins));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidUserNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowInvalidNumberException(int n1, int n2, int n3, int n4, int n5, int n6) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(n1);
        userNumbers.add(n2);
        userNumbers.add(n3);
        userNumbers.add(n4);
        userNumbers.add(n5);
        userNumbers.add(n6);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidUserNumbersFiveNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowInvalidNumberException(int n1, int n2, int n3, int n4, int n5) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(n1);
        userNumbers.add(n2);
        userNumbers.add(n3);
        userNumbers.add(n4);
        userNumbers.add(n5);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidUserNumbersSevenNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowInvalidNumberException(int n1, int n2, int n3, int n4, int n5, int n6, int n7) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(n1);
        userNumbers.add(n2);
        userNumbers.add(n3);
        userNumbers.add(n4);
        userNumbers.add(n5);
        userNumbers.add(n6);
        userNumbers.add(n7);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
    }
}
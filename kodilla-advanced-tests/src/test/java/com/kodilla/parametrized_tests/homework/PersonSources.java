package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForTestingGetBMI() {

        return Stream.of(
                Arguments.of(new Person(1.65, 40), "Very severely underweight"),
                Arguments.of(new Person(1.70, 44), "Severely underweight"),
                Arguments.of(new Person(1.85, 63), "Underweight"),
                Arguments.of(new Person(1.73, 74), "Normal (healthy weight)"),
                Arguments.of(new Person(1.91, 109), "Overweight"),
                Arguments.of(new Person(1.55, 84), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(2.05, 168), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.60, 115), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.81, 163), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.97, 232), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.58, 150), "Obese Class VI (Hyper Obese)")
        );
    }
}

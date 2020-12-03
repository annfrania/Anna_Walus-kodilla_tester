package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoublesSources {
    static Stream<Arguments> providesDoublesForBMICalculation() {
        return Stream.of(
                Arguments.of(new Person(1.75,32),"Very severely underweight"),
                Arguments.of(new Person(1.7,51.5),"Underweight"),
                Arguments.of(new Person(1.7,60.5),"Normal (healthy weight)"),
                Arguments.of(new Person(1.82,125.5),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.78,135.5),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.65,170.5),"Obese Class VI (Hyper Obese)")
        );
    }
}


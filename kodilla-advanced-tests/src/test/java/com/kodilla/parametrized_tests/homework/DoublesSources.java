package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoublesSources {
    static Stream<Arguments> providesDoublesForBMICalculation() {
        return Stream.of(
                Arguments.of(new Person(1.75,32).getBMI(),"Very severely underweight"),
                Arguments.of(new Person(1.7,51.5).getBMI(),"Underweight"),
                Arguments.of(new Person(1.7,60.5).getBMI(),"Normal (healthy weight)"),
                Arguments.of(new Person(1.82,125.5).getBMI(),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.78,135.5).getBMI(),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.65,170.5).getBMI(),"Obese Class VI (Hyper Obese)")
        );
    }
}


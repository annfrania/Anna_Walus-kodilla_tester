package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class StringsSourcesTestSuite {
    StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringsSources#provideStringsForTestingLength")

    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }
}
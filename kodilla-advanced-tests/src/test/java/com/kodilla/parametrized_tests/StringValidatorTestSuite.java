package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmptyandNull(String text) {
        assertTrue(validator.isBlank(text));
    }

}
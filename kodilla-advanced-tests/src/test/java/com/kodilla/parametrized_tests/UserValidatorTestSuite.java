package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Kim", "one.11", "rOb_89", "4AA45."})
    public void shouldUserNameBeTrue (String username) {
        assertTrue(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @CsvSource(value = {"Ki", "one.?11", "rOb_##", "4AA45.&"})
    public void shouldUserNameBeFalse (String username) {
        assertFalse(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @CsvSource(value = {"Kim@vp.pl", "one.11@o2.pl", "rOb_89@gmail.com", "4AA45@dietetyk-bielsko.pl"})
    public void shouldEmailBeTrue (String email) {
        assertTrue(userValidator.validateEmail(email));
    }
    @ParameterizedTest
    @CsvSource(value = {"Kimvp.pl", "one.11@o2pl", "rOb_89@gmail.@com", "4AA45@dietetyk&bielsko.pl.pl"})
    public void shouldEmailBeFalse (String email) {
        assertFalse(userValidator.validateEmail(email));
    }

}
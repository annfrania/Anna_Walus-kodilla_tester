package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;


class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @Test
    public void happyPath() throws InvalidNumbersException {
    Set<Integer> numbers = new HashSet<>();
        numbers.add(12);
        numbers.add(22);
        numbers.add(32);
        numbers.add(8);
        numbers.add(16);
        numbers.add(42);

      int result = gamblingMachine.howManyWins(numbers);
        assertTrue(result >= 0);
        assertTrue(result <= 6);
    }
    @Test
    public void wrongSizeOfSet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(12);
        numbers.add(22);
        numbers.add(32);
        numbers.add(8);
        numbers.add(16);

        Assertions.assertThrows(InvalidNumbersException.class, () ->{
            gamblingMachine.howManyWins(numbers);
        });
    }
//    @Test
//    public void wrongNumbersRange() throws InvalidNumbersException{
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(12);
//        numbers.add(-22);
//        numbers.add(32);
//        numbers.add(8);
//        numbers.add(16);
//        numbers.add(82);
//
//        for (Integer number : numbers) {
//            boolean wrongRange = number < 1 || number > 50;
//            if(wrongRange)
//                throw new InvalidNumbersException();
//            assertFalse(wrongRange);
//        }
    }

package com.kodilla.stream.exception;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AirportRepositoryTestSuite {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        Assert.assertTrue(isWarsawInUse);
    }
    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException{
        AirportRepository airportRepository = new AirportRepository();
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        Assert.assertFalse(isWarsawInUse);
    }
}
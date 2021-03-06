package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        if(time.isAfter(LocalTime.of(6,00))||
                time.isBefore(LocalTime.of(20,00))) {
            return true;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}

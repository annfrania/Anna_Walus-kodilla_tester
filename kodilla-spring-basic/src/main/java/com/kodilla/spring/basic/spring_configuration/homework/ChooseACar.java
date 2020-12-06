package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalTime;


@Configuration
public class ChooseACar {

    @Bean
    public Car seasonalCar(String season,LocalTime time) {
        Car car;
        if (season.equals("Spring") || season.equals("Autumn")) {
            car = new Sedan();
            car.hasHeadlightsTurnedOn(time);
        } else if (season.equals("Summer")) {
            car = new Cabrio();
            car.hasHeadlightsTurnedOn(time);
        } else {
            car = new SUV();
            car.hasHeadlightsTurnedOn(time);
        }
        return car;
    }

}
package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;


@Configuration
public class ChooseACar {


    @Bean
    public Car seasonalCar(LocalDateTime now) {
        Car car;

        int month = now.getMonthValue();
        if (month>=3 && month<=6) {
            car = new Sedan();
            car.hasHeadlightsTurnedOn(LocalTime.of(now.getHour(),now.getMinute()));
        } else if (season.equals(summer)) {
            car = new Cabrio();
            car.hasHeadlightsTurnedOn(time);
        } else {
            car = new SUV();
            car.hasHeadlightsTurnedOn(time);
        }
        return car;
    }
    @Bean
    public LocalDateTime getNow(){
        return LocalDateTime.now();
    }
}
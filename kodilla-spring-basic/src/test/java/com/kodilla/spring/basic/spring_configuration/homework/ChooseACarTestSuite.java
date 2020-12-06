package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.dependency_injection.homework.Application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChooseACarTestSuite {

    @Test
    public void shouldCreateACarDependingOnASeason(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Car car = (Car) context.getBean("seasonalCar");
        ChooseACar bean = context.getBean(ChooseACar.class);
        Car car = bean.seasonalCar("Spring", LocalTime.of(19,15));

        String newCar = car.getCarType();
        System.out.println(newCar);

        Assertions.assertEquals("Sedan", newCar);
    }
    @Test
    public void shouldTellIfHeadLigthsShouldBeOn(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car bean = context.getBean(Car.class);
        boolean lightsOn = bean.hasHeadlightsTurnedOn(LocalTime.of(13,30));
        Assertions.assertTrue(lightsOn);
    }
}
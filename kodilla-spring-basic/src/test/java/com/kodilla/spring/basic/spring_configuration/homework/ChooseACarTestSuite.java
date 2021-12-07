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
        Car car = (Car) context.getBean("seasonalCar");

        String newCar = car.getCarType();
        System.out.println(newCar);

        Assertions.assertEquals("Sedan",newCar);
        Assertion lights!
    }
    @Test
    public void shouldTellIfHeadLigthsShouldBeOn(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car bean = context.getBean(Car.class);
        SeasonAndTime bean2 = context.getBean(SeasonAndTime.class);
        boolean lightsOn = bean.hasHeadlightsTurnedOn(bean2.getTime());
        Assertions.assertTrue(lightsOn);
    }
}
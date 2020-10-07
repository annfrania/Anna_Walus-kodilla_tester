package com.kodilla.collections.arrays.homework;

import interfaces.homework.Car;
import interfaces.homework.Ferrari;
import interfaces.homework.Ford;
import interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-------");
        System.out.println("The car is: " + getCarName(car));
        System.out.println("The initial speed is: " + car.getSpeed());

    }
    private static String getCarName(Car car){
        if (car instanceof Ferrari)
            return "Ferrari";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car type.";
    }
}

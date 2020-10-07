package com.kodilla.collections.arrays.homework;

import interfaces.homework.Car;
import interfaces.homework.Ferrari;
import interfaces.homework.Ford;
import interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)+1];
        for (int c = 0; c < cars.length; c++)
            cars[c] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    public static Car drawCar(){
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int a = random.nextInt(100) + 15;
        if (drawCarKind == 0)
            return new Ferrari(a);
        else if (drawCarKind == 1)
            return new Toyota(a);
        else
            return new Ford(a);
    }
}

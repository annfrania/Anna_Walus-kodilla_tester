package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private int r;
    private final double PI = 3.14;

    public Circle (int r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return r * r * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * r * PI;
    }
}

package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }
    public void turnOn() {
        System.out.println("System is turned on.");
    }
    public void turnOff() {
        System.out.println("System is turned off.");
    }
    public void displayYearOfRelease() {
        System.out.println("The year of release is: " + year);
    }
    public int getYear() {
        return year;
    }
}

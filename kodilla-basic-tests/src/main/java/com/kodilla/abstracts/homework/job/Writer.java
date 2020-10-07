package com.kodilla.abstracts.homework.job;

public class Writer extends Job {

    public Writer(double salary) {
        super(7000);
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Writing books.");
    }
}

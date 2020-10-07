package com.kodilla.abstracts.homework.job;

public class Nurse extends Job {
    public Nurse(double salary) {
        super(5000);
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Writing books.");
    }
}

package com.kodilla.abstracts.homework.job;

public class Pilot extends Job {
    public Pilot(double salary) {
        super(9000);
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Steering the plane.");
    }
}

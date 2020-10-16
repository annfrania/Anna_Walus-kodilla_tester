package com.kodilla.abstracts.homework.job;

public class Responsibilities {

    public static void main(String[] args) {

        Person person = new Person("John", 38, new Pilot(9000));
        person.job.getResponsibilities();

    }
}

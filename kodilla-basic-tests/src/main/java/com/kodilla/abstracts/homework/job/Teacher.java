package com.kodilla.abstracts.homework.job;

import com.kodilla.abstracts.homework.job.Job;

public class Teacher extends Job {

    public Teacher() {
        super(4000);
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Teaching others.");
    }
}

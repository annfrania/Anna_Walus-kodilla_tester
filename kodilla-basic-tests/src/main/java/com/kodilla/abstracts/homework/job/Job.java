package com.kodilla.abstracts.homework.job;

public abstract class Job {
    private double salary;

    public Job(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public abstract void getResponsibilities();

}

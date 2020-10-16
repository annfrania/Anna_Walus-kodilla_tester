package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> schools = new ArrayList<>();

    public School(int ... studentsNumber) {
        for(int school : studentsNumber)
            this.schools.add(school);
    }
    public int getSum() {
        int sum = 0;
        for (int school : schools)
            sum = sum + school;
        return sum;
    }
    @Override
    public String toString() {
        return "School{" +
                "schools=" + schools +
                '}';
    }
}

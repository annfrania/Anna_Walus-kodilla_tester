package com.kodilla.collections.sets.homework;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Castle", "12mm x 18mm","yes"));
        stamps.add(new Stamp("Horses","18mm x 25mm","yes"));
        stamps.add(new Stamp ("King George","20mm x 23mm","no"));
        stamps.add(new Stamp("Horses","18mm x 25mm","yes"));
        stamps.add(new Stamp("Horses","18mm x 25mm","yes"));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

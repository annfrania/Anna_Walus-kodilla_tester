package com.kodilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    public static Map <String,List<Flight>> getFlightsTable() {
        Map<String,List<Flight>> flightsPlan = new HashMap<>();
        List<Flight> f1 = new ArrayList<>();
        f1.add(new Flight("Lisbon","Paris"));
        f1.add(new Flight("Lisbon","Tokyo"));
        flightsPlan.put("Lisbon",f1);
        List<Flight> f2 = new ArrayList<>();
        f2.add(new Flight("London","Warsaw"));
        flightsPlan.put("London",f2);
        List<Flight> f3 = new ArrayList<>();
        f3.add(new Flight("Rome","Lisbon"));
        flightsPlan.put("Rome",f3);
        List<Flight> f4 = new ArrayList<>();
        f4.add(new Flight("Paris","Rome"));
        flightsPlan.put("Paris",f4);
        List<Flight> f5 = new ArrayList<>();
        f5.add(new Flight("Warsaw","Paris"));
        flightsPlan.put("Warsaw",f5);

        return flightsPlan;
    }

    public static void main(String[] args) {

    }

}

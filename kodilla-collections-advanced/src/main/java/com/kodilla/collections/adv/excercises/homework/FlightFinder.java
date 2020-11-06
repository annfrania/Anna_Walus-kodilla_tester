package com.kodilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {
    Map<String, List<Flight>> flightsPlan = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        return flightsPlan.get(departure);
    }
//        List<Flight> flightsFrom = new ArrayList<>();
//        String departure1 = "Lisbon";
//
//        Flight flight = new Flight(departure,arrival);
//        boolean ifDeparture = flight.getDeparture().equals(departure1);
//        if (ifDeparture) {
//        flightsFrom.add(flight);
//        }
//        return flightsFrom;


    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights = flightsPlan.values()
                .stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        return flights
                .stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());

    }
//        String arrival1 = "Warsaw";
//
//        for (Map.Entry<String, List<Flight>> flightEntry : flightsPlan.entrySet()) {
//            List<Flight> flightsTo = new ArrayList<>(flightEntry.getValue());
//            if (flightEntry.getValue().equals(arrival1)) { //jak wyciągnąć 1 flight
//                flightsTo.add();
//            }
//            return flightsTo;
//        }


}

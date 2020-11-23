package com.kodilla.notification.homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlertService {

    Map<Location, Set<Customer>> locations = new HashMap<>();

    public void addCustomerToLocation(Location location, Customer customer) {
        Set<Customer> customers = locations.getOrDefault(location, new HashSet<>());
        customers.add(customer);
        locations.put(location, customers);
    }

    public void sendAlertWithLocation(Location location, Alert alert) {
        Set<Customer> customersOneLocation = locations.get(location);
        customersOneLocation.forEach(c -> c.receive(alert));
    }

    public void sendAlertToAll(Alert alert) {
        for (Map.Entry<Location, Set<Customer>> oneLocation : locations.entrySet()) {
            //lub .map(map.Entry::getValue)??
            oneLocation.getValue().forEach(c -> c.receive(alert));
            //co z powtórkami???
        }
    }

    public void removeCustomer(Location location, Customer customer) {

        for (Map.Entry<Location, Set<Customer>> oneLocation : locations.entrySet()) {
            //lub .map(map.Entry::getValue)??
            if (oneLocation.getKey().equals(location))
                oneLocation.getValue().remove(customer);

//        List<Customer> newList = locations
//                .stream()
//                .collect(Collectors.groupingBy(location.equals(location)))
//                .filter(l -> l.equals(location))
//                .forEach(locations.remove(customer));
        }
    }
    }

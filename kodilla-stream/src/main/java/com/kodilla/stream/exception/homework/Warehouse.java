package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Warehouse {
    Set<Order> orderSet = new HashSet<>();

    public void addOrder(Order order){
      orderSet.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException{
        return orderSet
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                .orElseThrow(()-> new OrderDoesntExistException());

    }
}

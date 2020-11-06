package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2020/99"));
        warehouse.addOrder(new Order("2020/23"));
        warehouse.addOrder(new Order("2020/53"));
        warehouse.addOrder(new Order("2020/78"));
        warehouse.addOrder(new Order("2020/67"));

        try {
            warehouse.getOrder("2020/78");
            System.out.println("Order number exists.");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order number doesn't exist");
        } finally{
            System.out.println("Thanks.");
        }

    }
}

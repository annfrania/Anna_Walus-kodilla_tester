package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addOrder(new Order(354.98,"Diana", LocalDate.of(2019,12,7)));
        shop.addOrder(new Order(65.99,"locoloco95", LocalDate.of(2017,1,26)));
        shop.addOrder(new Order(754.50,"NoName", LocalDate.of(2015,5,17)));
        shop.addOrder(new Order(155.98,"paula1234", LocalDate.of(2020,9,27)));
        shop.addOrder(new Order(260.05,"robrobi", LocalDate.of(2020,10,15)));
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List<Order> returnListOfOrdersByDate(){
        List<Order> orderList = new ArrayList<>();
        for (Order order1 : orders){
            if (order1.getDate().isAfter(LocalDate.of(2018,11,12)))
            orderList.add(order1);
        }
        return orderList;
    }
    public Optional<Order> getOrdersByValueMax() {
        return orders.stream().max(Comparator.comparingDouble(Order::getValue));
    }
    public Optional<Order> getOrdersByValueMin() {
        return orders.stream().min(Comparator.comparingDouble(Order::getValue));
    }

    public int getNumberOfOrders(){
        return orders.size();
    }

    public double getSum(){
        double sum = orders.stream().mapToDouble(Order::getValue).sum();
        return sum;
    }
}

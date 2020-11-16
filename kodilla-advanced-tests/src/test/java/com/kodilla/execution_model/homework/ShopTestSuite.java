package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop1 = new Shop();

    @Test
    public void shouldAddNewOrder() {
        shop1.addOrder(new Order(24.99, "shrek", LocalDate.of(2020, 9, 9)));
        assertEquals(6, shop1.getNumberOfOrders());
    }

    @Test
    public void shouldReturnListOfOrdersFromLastTwoYears() {
        List newOrders = new ArrayList<>();

        newOrders.add(new Order(354.98, "Diana", LocalDate.of(2019, 12, 7)));
        newOrders.add(new Order(155.98, "paula1234", LocalDate.of(2020, 9, 27)));
        newOrders.add(new Order(260.05, "robrobi", LocalDate.of(2020, 10, 15)));

        assertEquals(newOrders, shop1.returnListOfOrdersByDate());
    }

    @Test
    public void shouldGetTheSmallestAndTheBiggestValueOrders() {
        Order max = new Order(754.50, "NoName", LocalDate.of(2015, 5, 17));

        Order min = new Order(65.99, "locoloco95", LocalDate.of(2017, 1, 26));
        assertEquals(max, shop1.getOrdersByValueMax());
        assertEquals(min, shop1.getOrdersByValueMin());
    }

    @Test
    public void shouldGetTheNumberOfOrders() {
        assertEquals(5, shop1.getNumberOfOrders());
    }

    @Test
    public void shouldGetTheSumOfOrdersValues() {
        assertEquals(1591.5, shop1.getSum());
    }

    @BeforeEach
    public void createOrderListInTheShop() {
        shop1.addOrder(new Order(354.98, "Diana", LocalDate.of(2019, 12, 7)));
        shop1.addOrder(new Order(65.99, "locoloco95", LocalDate.of(2017, 1, 26)));
        shop1.addOrder(new Order(754.50, "NoName", LocalDate.of(2015, 5, 17)));
        shop1.addOrder(new Order(155.98, "paula1234", LocalDate.of(2020, 9, 27)));
        shop1.addOrder(new Order(260.05, "robrobi", LocalDate.of(2020, 10, 15)));
    }

}
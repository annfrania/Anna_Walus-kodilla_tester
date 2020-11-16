package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double value;
    private String userName;
    private LocalDate date;

    public Order(double value, String userName, LocalDate date) {
        this.value = value;
        this.userName = userName;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", userName='" + userName + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 &&
                Objects.equals(userName, order.userName) &&
                Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, userName, date);
    }
}


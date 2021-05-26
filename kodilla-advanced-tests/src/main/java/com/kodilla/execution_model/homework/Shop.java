package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public List<Order> getOrders(LocalDate startDate, LocalDate endDate){
        List<Order> chosenOrders = new ArrayList<>();
        LocalDate date;
        for (Order order : orders) {
            date = order.getDate();
            if ((date.isAfter(startDate) && date.isBefore(endDate)) || date.isEqual(startDate) || date.isEqual(endDate))
                chosenOrders.add(order);
        }
        return chosenOrders;
    }

    public List<Order> getOrders(double minValue, double maxValue){
        List<Order> chosenOrders = new ArrayList<>();
        double value;
        for (Order order : orders) {
            value = order.getValue();
            if (value >= minValue && value <= maxValue)
                chosenOrders.add(order);
        }
        return chosenOrders;
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public double getTotalOrderValue(){
        double sum = 0;
        for (Order order:orders) {
            sum += order.getValue();
        }
        return sum;
    }
}

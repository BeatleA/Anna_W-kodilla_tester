package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> order = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny();
        if (order.isPresent())
            return order.get();
        throw new OrderDoesntExistException();
    }
}

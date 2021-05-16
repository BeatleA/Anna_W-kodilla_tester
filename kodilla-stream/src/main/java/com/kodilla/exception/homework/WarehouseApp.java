package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("124"));
        warehouse.addOrder(new Order("125"));
        warehouse.addOrder(new Order("127"));

        try {
            Order order = warehouse.getOrder("126");
            System.out.println("Order " + order.getNumber() + " has been found.");
        } catch (OrderDoesntExistException e) {
            System.out .println("Sorry, this order could not be found in the warehouse.");
        }
    }
}

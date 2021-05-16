package com.kodilla.exception.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {

    @DisplayName("State under test: order added " +
                 "Expected behaviour: correct order returned by getOrder()")
    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        Order expectedOrder = new Order("10");
        warehouse.addOrder(expectedOrder);
        Order order = warehouse.getOrder("10");
        // then
        assertEquals(expectedOrder, order);
    }

    @DisplayName("State under test: no orders exist, an order requested from getOrder() " +
                 "Expected behaviour: exception OrderDoesntExistException thrown")
    @Test
    public void testGetOrder_noOrders_withException() throws OrderDoesntExistException {

        assertThrows(OrderDoesntExistException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Warehouse warehouse = new Warehouse();
                Order order = warehouse.getOrder("9");
            }
        });
    }

    @DisplayName("State under test: order added, different order requested from getOrder() " +
                 "Expected behaviour: exception OrderDoesntExistException thrown")
    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {

        assertThrows(OrderDoesntExistException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Warehouse warehouse = new Warehouse();
                warehouse.addOrder(new Order("10"));
                Order order = warehouse.getOrder("9");
            }
        });
    }

}
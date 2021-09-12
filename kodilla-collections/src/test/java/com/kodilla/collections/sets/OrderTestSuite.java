package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {

    @Test
    public void shouldCorrectlyReturnOrderNumber() {
        //Given
        Order order = new Order("3/2019", "Chair", 2.0);
        //When
        String orderNumber = order.getOrderNumber();
        //Then
        assertEquals("3/2019", orderNumber);
    }

    @Test
    public void shouldCorrectlyReturnProductName() {
        //Given
        Order order = new Order("3/2019", "Chair", 2.0);
        //When
        String productName = order.getProductName();
        //Then
        assertEquals("Chair", productName);
    }

    @Test
    public void shouldCorrectlyReturnQuantity() {
        //Given
        Order order = new Order("3/2019", "Chair", 2.0);
        //When
        double quantity = order.getQuantity();
        //Then
        assertEquals(2.0, quantity, 0.01);
    }
}
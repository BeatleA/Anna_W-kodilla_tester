package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order davidsOrder = new Order(23.53, LocalDate.of(2021, 5, 20), "david20");
    Order laurasOrder = new Order(55.10, LocalDate.of(2021, 4, 15), "laura95");
    Order ronsOrder = new Order(10.99, LocalDate.of(2020, 9, 6), "ron-the-great");

    @Test
    public void shouldAddOrdersToShop(){
        // when
        int result = shop.getNumberOfOrders();
        // then
        assertEquals(3, result);
    }

    @Test
    public void shouldGetOrdersWithinGivenDates(){
        // when
        List<Order> result = shop.getOrders(LocalDate.of(2020,7, 1), LocalDate.of(2021,4,15));
        // then
        assertEquals(2, result.size());
        assertEquals(55.10, result.get(0).getValue(), 0.01);
        assertEquals(10.99, result.get(1).getValue(), 0.01);
        assertEquals("laura95", result.get(0).getLogin());
        assertEquals("ron-the-great", result.get(1).getLogin());
    }

    @Test
    public void shouldGetOrdersWithinGivenValues(){
        // when
        List<Order> result = shop.getOrders(23.53, 55.11);
        // then
        assertEquals(2, result.size());
        assertEquals(LocalDate.of(2021, 5, 20), result.get(0).getDate());
        assertEquals(LocalDate.of(2021, 4, 15), result.get(1).getDate());
        assertEquals("david20", result.get(0).getLogin());
        assertEquals("laura95", result.get(1).getLogin());
    }

    @Test
    public void shouldReturnEmptyListWhenPassingOutOfRangeDates(){
        // when
        List<Order> result = shop.getOrders(LocalDate.of(2019,5, 1), LocalDate.of(2020,5,5));
        // then
        assertEquals(0, result.size());
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void shouldReturnEmptyListWhenPassingOutOfRangeValues(){
        // when
        List<Order> result = shop.getOrders(55.11,70.5);
        // then
        assertEquals(0, result.size());
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void shouldReturnTotalOrderValue(){
        // when
        double result = shop.getTotalOrderValue();
        // then
        assertEquals(89.62, result, 0.01);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(davidsOrder);
        shop.addOrder(laurasOrder);
        shop.addOrder(ronsOrder);
    }
}
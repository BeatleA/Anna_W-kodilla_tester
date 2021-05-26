package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item book = new Item("Book", 7.99);
    Item notepad = new Item("Notepad", 3.99);
    Item pen = new Item("Pen", 1.00);

    @Test
    public void shouldAddItemsToInvoice() {
        // when
        int result = invoice.getSize();
        // then
        assertEquals(3, result);
    }

    @Test
    public void shouldGetExistingItems() {
       // when
        Item result = invoice.getItem(1);
        // then
        assertEquals("Notepad", result.getName());
        assertEquals(3.99, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex(){
       // when
        Item result = invoice.getItem(-1);
        // then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex(){
        // when
        Item result = invoice.getItem(3);
        // then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice(){
        // when
        invoice.clear();
        // then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(book);
        invoice.addItem(notepad);
        invoice.addItem(pen);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
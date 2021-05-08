package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @DisplayName("State under test: no books exist, new book being created " +
                 "Expected behaviour: new book created correctly")
    @Test
    public void shouldCreateNewBook(){
        Book book = new Book("The Lost Symbol", "Dan Brown");
        assertEquals(true, Objects.nonNull(book));
        assertEquals("The Lost Symbol", book.getTitle());
        assertEquals("Dan Brown", book.getAuthor());
    }

    @DisplayName("State under test: three books created, titles requested " +
                 "Expected behaviour: correct titles returned")
    @Test
    public void shouldReturnCorrectTitle(){
        Book book1 = new Book("The Lost Symbol", "Dan Brown");
        Book book2 = new Book("The Kingmaker's Daughter", "Philippa Gregory");
        Book book3 = new Book("The Red Queen", "Philippa Gregory");
        assertEquals("The Lost Symbol", book1.getTitle());
        assertEquals("The Kingmaker's Daughter", book2.getTitle());
        assertEquals("The Red Queen", book3.getTitle());
    }

    @DisplayName("State under test: three books created, authors requested " +
                 "Expected behaviour: correct authors returned")
    @Test
    public void shouldReturnCorrectAuthor(){
        Book book1 = new Book("The Lost Symbol", "Dan Brown");
        Book book2 = new Book("The Kingmaker's Daughter", "Philippa Gregory");
        Book book3 = new Book("The Red Queen", "Philippa Gregory");
        assertEquals("Dan Brown", book1.getAuthor());
        assertEquals("Philippa Gregory", book2.getAuthor());
        assertEquals("Philippa Gregory", book3.getAuthor());
    }
}

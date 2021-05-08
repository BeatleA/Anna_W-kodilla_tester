package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookManagerTestSuite {

    @DisplayName("State under test: new book being created " +
                 "Expected behaviour: new book created correctly")
    @Test
    public void shouldCreateNewBook(){
        Book book = BookManager.createBook("The Lost Symbol", "Dan Brown");
        assertEquals(true, Objects.nonNull(book));
        assertEquals("The Lost Symbol", book.getTitle());
        assertEquals("Dan Brown", book.getAuthor());
    }

    @DisplayName("State under test: three books created " +
                 "Expected behaviour: three books created correctly")
    @Test
    public void shouldCreateThreeBooks(){
        Book book1 = new Book("The White Queen", "Philippa Gregory");
        Book book2 = new Book("The Kingmaker's Daughter", "Philippa Gregory");
        Book book3 = new Book("The Red Queen", "Philippa Gregory");
        assertEquals(true, Objects.nonNull(book1));
        assertEquals(true, Objects.nonNull(book2));
        assertEquals(true, Objects.nonNull(book3));
        assertEquals("The White Queen", book1.getTitle());
        assertEquals("Philippa Gregory", book1.getAuthor());
        assertEquals("The Kingmaker's Daughter", book2.getTitle());
        assertEquals("Philippa Gregory", book2.getAuthor());
        assertEquals("The Red Queen", book3.getTitle());
        assertEquals("Philippa Gregory", book3.getAuthor());
    }

    @DisplayName("State under test: three books created, two duplicated " +
                 "Expected behaviour: two book references created")
    @Test
    public void shouldCreateTwoBookReferences(){
        Book book1 = new Book("The Red Queen", "Philippa Gregory");
        Book book2 = new Book("The Kingmaker's Daughter", "Philippa Gregory");
        Book book3 = new Book("The Red Queen", "Philippa Gregory");
        assertEquals(true, Objects.nonNull(book1));
        assertEquals(true, Objects.nonNull(book2));
        assertEquals(true, Objects.nonNull(book3));
        assertEquals(book1, book3);
        assertNotEquals(book1, book2);
        assertNotEquals(book2, book3);
    }

    @DisplayName("State under test: three different books created " +
                 "Expected behaviour: three different book references created")
    @Test
    public void shouldCreateThreeBookReferences(){
        Book book1 = new Book("The White Queen", "Philippa Gregory");
        Book book2 = new Book("The Kingmaker's Daughter", "Philippa Gregory");
        Book book3 = new Book("The Red Queen", "Philippa Gregory");
        assertEquals(true, Objects.nonNull(book1));
        assertEquals(true, Objects.nonNull(book2));
        assertEquals(true, Objects.nonNull(book3));
        assertNotEquals(book1, book2);
        assertNotEquals(book1, book3);
        assertNotEquals(book2, book3);
    }
}

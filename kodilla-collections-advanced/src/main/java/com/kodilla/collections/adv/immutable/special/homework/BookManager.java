package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author){
        Book book = new Book(title, author);
        int bookIndex = books.indexOf(book);
        if (bookIndex != -1){
            return books.get(bookIndex);
        } else {
            books.add(book);
            return book;
        }
    }
}

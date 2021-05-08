package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("The White Queen", "Philippa Gregory");
        Book book2 = BookManager.createBook("A Prisoner of Birth", "Jeffrey Archer");
        Book book3 = BookManager.createBook("The White Queen", "Philippa Gregory");

        System.out.println(book1 == book2);
        System.out.println(book1 == book3);
        System.out.println(book2 == book3);
    }
}

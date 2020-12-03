package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Robinson Crusoe", "Daniel Defoe");
        Book book2 = bookManager.createBook("Gulliver's Travels", "J.Swift");
        Book book3 = bookManager.createBook("Emma", "Jane Austin");
        Book book4 = bookManager.createBook("Robinson Crusoe", "Daniel Defoe");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());

        System.out.println(bookManager.getSize());
    }
}

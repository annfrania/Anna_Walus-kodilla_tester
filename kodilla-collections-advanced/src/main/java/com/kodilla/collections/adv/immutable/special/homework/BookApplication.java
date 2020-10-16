package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new Book("Robinson Crusoe", "Daniel Defoe");
        Book book2 = new Book("Gulliver's Travels","J.Swift");
        Book book3 = new Book("Emma","Jane Austin");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

//        BookManager book = new Book("Robinson Crusoe","D.Defoe");
//        book.createBook();
    }
}

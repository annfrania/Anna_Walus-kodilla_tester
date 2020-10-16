package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("H.Andersen", "Fairy Tales");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("Stupid Tales");
        System.out.println(book.getTitle());
    }

}

public class Book {
    private String author;
    private String title;

    public Book (String author, String title) { //konstruktor
    }
    Book book1 = new Book ("George Orwell","Animal farm");

    public static String displayBooksData() {

        String of = Book.displayBooksData();
        System.out.println(author + title);

        Book book1 = Book.of("George Orwell", "Animal Farm");

    }

}

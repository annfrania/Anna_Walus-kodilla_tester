public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of (String author, String title) {
        return new Book(author, title);
    }
    // użycie
    Book book1 = Book.of ("George Orwell", "Animal Farm");

}

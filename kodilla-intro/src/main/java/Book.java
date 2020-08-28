public class Book {
    private String author;
    private String title;
// bez tworzenia obiektu?
    Book book = new Book ("George Orwell" ; "Animal Farm");
//    String book = ("George Orwell" ; "Animal Farm");

    public static String of (String author, String title) {
        String statement = "This is" + title + "of" + author;
        return statement;
    }
    // użycie
    Book book1 = Book.of ("George Orwell", "Animal Farm");


}

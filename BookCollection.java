import java.util.ArrayList;

class Book {
    // Attributes
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    // toString method to print book info
    @Override
    public String toString() {
        return title + " by " + author + ", ISBN: " + isbn;
    }
}

public class BookManager {
    public static void main(String[] args) {
        // Create a collection to store books
        ArrayList<Book> books = new ArrayList<>();

        // Create and add books
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");

        books.add(book1);
        books.add(book2);

        // Display the list of books
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Remove a book
        books.remove(book1);

        // Display updated list
        System.out.println("\nAfter removing The C Programming Language:");
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
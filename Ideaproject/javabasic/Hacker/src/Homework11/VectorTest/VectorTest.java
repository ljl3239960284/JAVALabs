package Homework11.VectorTest;

import java.util.Vector;

class Book {
    String isbn;
    String name;
    String author;
    double price;
    String language;

    Book(String isbn, String name, String author, double price, String language) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Name='" + name + '\'' +
                ", Author='" + author + '\'' +
                ", Price=" + price +
                ", Language='" + language + '\'' +
                '}';
    }
}

public class VectorTest {
    public static void main(String[] args) {
        // Create a Vector to store Book objects
        Vector<Book> books = new Vector<>();

        // Add some Book objects to the Vector
        books.add(new Book("9898001", "Introduction to Electrodynamics", "William", 35, "English"));
        books.add(new Book("9898005", "Transfer of Heat and Mass", "Jack", 78, "Chinese"));

        // Print the Vector
        System.out.println("Books in the vector: " + books);

        // Remove a book from the Vector
        books.remove(1);
        System.out.println("Books in the vector after removal: " + books);

        // Find a book by its ISBN
        Book bookToFind = null;
        for (Book book : books) {
            if (book.isbn.equals("9898001")) {
                bookToFind = book;
                break;
            }
        }
        System.out.println("Book found: " + bookToFind);
    }
}

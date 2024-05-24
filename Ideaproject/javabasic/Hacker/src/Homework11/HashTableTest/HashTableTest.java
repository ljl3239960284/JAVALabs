package Homework11.HashTableTest;

import java.awt.print.Book;
import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args) {
        // Create a Hashtable to store Book objects with ISBN as the key
        Hashtable<String, Book> bookTable = new Hashtable<>();

        // Add some Book objects to the Hashtable
        bookTable.put("9898001", new Book("9898001", "Introduction to Electrodynamics", "William", 35, "English"));
        bookTable.put("9898005", new Book("9898005", "Transfer of Heat and Mass", "Jack", 78, "Chinese"));

        // Retrieve a Book by its ISBN
        Book book = bookTable.get("9898001");
        System.out.println("Book retrieved: " + book);

        // Retrieve all Books
        for (String isbn : bookTable.keySet()) {
            System.out.println("ISBN: " + isbn + ", Book: " + bookTable.get(isbn));
        }
    }
}

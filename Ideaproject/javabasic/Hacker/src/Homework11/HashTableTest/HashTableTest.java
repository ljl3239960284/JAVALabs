package Homework11.HashTableTest;

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
        System.out.println("check if 9898001 exist in result: " + bookTable.containsKey("9898001"));

        // Retrieve all Books
        for (String isbn : bookTable.keySet()) {
            System.out.println("ISBN: " + isbn + ", 书籍: " + bookTable.get(isbn));
        }
    }
}

class Book {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private String language;

    public Book(String isbn, String title, String author, int price, String language) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", language='" + language + '\'' +
                '}';
    }
}

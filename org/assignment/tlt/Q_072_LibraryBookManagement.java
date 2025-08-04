package org.assignment.tlt;

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Q_072_LibraryBookManagement {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 550.0);
        Book book2 = new Book("Python Essentials", "Guido van Rossum", 500.0);

        if (book1.price > book2.price) {
            System.out.println("More expensive book: " + book1.title);
        } else if (book2.price > book1.price) {
            System.out.println("More expensive book: " + book2.title);
        } else {
            System.out.println("Both books have the same price.");
        }
    }
}


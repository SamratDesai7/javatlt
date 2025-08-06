package org.assignment.tlt;

import java.util.ArrayList;
import java.util.Iterator;

class Book {
    String title;
    String author;
    boolean isPublic;

    Book(String title, String author, boolean isPublic) {
        this.title = title;
        this.author = author;
        this.isPublic = isPublic;
    }

    public String toString() {
        return title + " by " + author + (isPublic ? " [Public]" : " [Private]");
    }
}

abstract class Library {
    ArrayList<Book> books = new ArrayList<>();

    abstract void addBook(Book book);

    void removeBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().title.equalsIgnoreCase(title)) {
                iterator.remove();
                break;
            }
        }
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

class PublicLibrary extends Library {
    @Override
    void addBook(Book book) {
        if (book.isPublic) {
            books.add(book);
        }
    }
}

class PrivateLibrary extends Library {
    @Override
    void addBook(Book book) {
        if (!book.isPublic) {
            books.add(book);
        }
    }
}

public class Q_101_LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Doe", true);
        Book b2 = new Book("Advanced Algorithms", "Jane Smith", false);
        Book b3 = new Book("Data Structures", "Mark Lee", true);
        Book b4 = new Book("Confidential AI", "Alan Turing", false);

        Library publicLib = new PublicLibrary();
        Library privateLib = new PrivateLibrary();

        publicLib.addBook(b1);
        publicLib.addBook(b2);
        publicLib.addBook(b3);

        privateLib.addBook(b1);
        privateLib.addBook(b2);
        privateLib.addBook(b4);

        System.out.println("Public Library:");
        publicLib.displayBooks();
        System.out.println();

        System.out.println("Private Library:");
        privateLib.displayBooks();
        System.out.println();

        publicLib.removeBook("Java Basics");
        privateLib.removeBook("Confidential AI");

        System.out.println("After Removal - Public Library:");
        publicLib.displayBooks();
        System.out.println();

        System.out.println("After Removal - Private Library:");
        privateLib.displayBooks();
    }
}

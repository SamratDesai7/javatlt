package org.assignment.tlt;

import java.util.Arrays;

class Book {
    private int id;
    private String name;
    private double price;
    private String author;

    public Book(int id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getAuthor() { return author; }

    public void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Author: " + author);
    }
}

class Library {
    private Book[] books = new Book[10];
    private int count = 0;

    public void addNewBooks(Book... newBooks) {
        for (Book b : newBooks) {
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (books[i].getId() == b.getId()) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate && count < books.length) {
                books[count++] = b;
            }
        }
    }

    public void showBooks() {
        for (int i = 0; i < count; i++) {
            books[i].show();
        }
    }

    public Book getBookByName(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        return null;
    }

    public Book[] getBookSortedByPrice() {
        Book[] sorted = Arrays.copyOf(books, count);
        Arrays.sort(sorted, (a, b) -> Double.compare((int) a.getPrice(), (int) b.getPrice()));
        return sorted;
    }

    public Book deleteBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                Book deleted = books[i];
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--count] = null;
                return deleted;
            }
        }
        return null;
    }

    public Book[] findBooksByPrice() {
        int size = 0;
        Book[] result = new Book[count];
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (books[i].getPrice() == books[j].getPrice()) {
                    if (!contains(result, books[i], size)) result[size++] = books[i];
                    if (!contains(result, books[j], size)) result[size++] = books[j];
                }
            }
        }
        return Arrays.copyOf(result, size);
    }

    private boolean contains(Book[] arr, Book b, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i].getId() == b.getId()) return true;
        }
        return false;
    }
}

public class Q_025_LibraryApplication {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book(1, "Java", 500, "James");
        Book b2 = new Book(2, "Python", 400, "Guido");
        Book b3 = new Book(3, "C++", 500, "Stroustrup");
        Book b4 = new Book(4, "React", 300, "Jordan");
        Book b5 = new Book(5, "MongoDB", 400, "Eliot");

        lib.addNewBooks(b1, b2, b3, b4, b5);
        System.out.println("All Books:");
        lib.showBooks();

        System.out.println("\nGet Book by ID 2:");
        Book found = lib.getBookByName(2);
        if (found != null) found.show();

        System.out.println("\nBooks Sorted by Price:");
        for (Book b : lib.getBookSortedByPrice()) {
            b.show();
        }

        System.out.println("\nDelete Book with ID 3:");
        Book deleted = lib.deleteBookById(3);
        if (deleted != null) deleted.show();

        System.out.println("\nBooks after deletion:");
        lib.showBooks();

        System.out.println("\nBooks with same price:");
        for (Book b : lib.findBooksByPrice()) {
            b.show();
        }
    }
}

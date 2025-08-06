package org.assignment.tlt;

interface BookOperations {
    static int compareByTitle(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Q_121_StaticMethodInInterface {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Alice");
        Book book2 = new Book("Data Structures", "Bob");

        int result = BookOperations.compareByTitle(book1, book2);
        if (result < 0) {
            System.out.println(book1.getTitle() + " comes before " + book2.getTitle());
        } else if (result > 0) {
            System.out.println(book2.getTitle() + " comes before " + book1.getTitle());
        } else {
            System.out.println("Both books have the same title.");
        }
    }
}

package org.assignment.tlt;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void displayDetails();
}

class FictionBook extends Book {
    String genre;

    FictionBook(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    void displayDetails() {
        System.out.println("Fiction Book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}

class NonFictionBook extends Book {
    String subject;

    NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Non-Fiction Book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

public class Q_100_BookDetails {
    public static void main(String[] args) {
        Book fiction = new FictionBook("1984", "George Orwell", "Dystopian");
        Book nonFiction = new NonFictionBook("A Brief History of Time", "Stephen Hawking", "Science");

        fiction.displayDetails();
        System.out.println();
        nonFiction.displayDetails();
    }
}

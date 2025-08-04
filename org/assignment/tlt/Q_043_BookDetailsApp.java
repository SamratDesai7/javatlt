package org.assignment.tlt;

abstract class Book {
    protected String title;
    protected String author;

    void setDetails(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void displayDetails();
}

class FictionBook extends Book {
    private String genre;

    void setGenre(String genre) {
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
    private String subject;

    void setSubject(String subject) {
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

public class Q_043_BookDetailsApp {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook();
        fiction.setDetails("The Hobbit", "J.R.R. Tolkien");
        fiction.setGenre("Fantasy");
        fiction.displayDetails();

        NonFictionBook nonfiction = new NonFictionBook();
        nonfiction.setDetails("A Brief History of Time", "Stephen Hawking");
        nonfiction.setSubject("Science");
        nonfiction.displayDetails();
    }
}

package org.assignment.tlt;

interface Readable {
    String getTitle();
    String getAuthor();
}

class Book implements Readable {
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

public class Q_118_InterfaceBook {
    public static void main(String[] args) {
        Book book = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}

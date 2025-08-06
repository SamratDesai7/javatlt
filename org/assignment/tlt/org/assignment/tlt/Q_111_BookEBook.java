package org.assignment.tlt;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    double fileSize; 
    String downloadLink;

    public EBook(String title, String author, double fileSize, String downloadLink) {
        super(title, author);
        this.fileSize = fileSize;
        this.downloadLink = downloadLink;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size    : " + fileSize + " MB");
        System.out.println("Download Link: " + downloadLink);
    }
}

public class Q_111_BookEBook {
    public static void main(String[] args) {
        EBook ebook = new EBook("Effective Java", "Joshua Bloch", 5.2, "https://example.com/effective-java");
        ebook.displayDetails();
    }
}

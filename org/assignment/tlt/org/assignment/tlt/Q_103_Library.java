package org.assignment.tlt;

public class Q_103_Library {

    public void addBook(String name) {
        System.out.println("Book Added: " + name);
    }

    public void addBook(String name, String author) {
        System.out.println("Book Added: " + name + ", Author: " + author);
    }

    public void addBook(String name, String author, int year) {
        System.out.println("Book Added: " + name + ", Author: " + author + ", Year: " + year);
    }

    public static void main(String[] args) {
        Q_103_Library library = new Q_103_Library();
        library.addBook("The Alchemist");
        library.addBook("1984", "George Orwell");
        library.addBook("To Kill a Mockingbird", "Harper Lee", 1960);
    }
}

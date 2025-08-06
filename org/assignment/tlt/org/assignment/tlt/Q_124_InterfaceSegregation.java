package org.assignment.tlt;

interface Printable {
    void print();
}

interface DigitalReadable {
    void readOnline();
}

interface Lendable {
    void lend();
}

class LibraryBook implements Printable, DigitalReadable, Lendable {
    private String title;

    public LibraryBook(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Printing book: " + title);
    }

    public void readOnline() {
        System.out.println("Reading online: " + title);
    }

    public void lend() {
        System.out.println("Lending book: " + title);
    }
}

public class Q_124_InterfaceSegregation {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming");
        book.print();
        book.readOnline();
        book.lend();
    }
}

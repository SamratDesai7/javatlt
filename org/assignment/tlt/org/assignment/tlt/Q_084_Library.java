package org.assignment.tlt;

public class Q_084_Library {
    String name;
    int numberOfBooks;

    Q_084_Library(String name, int numberOfBooks) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
    }

    void issueBook() {
        if (numberOfBooks > 0) {
            numberOfBooks--;
            System.out.println("Book issued. Remaining books: " + numberOfBooks);
        } else {
            System.out.println("No books available to issue.");
        }
    }

    void returnBook() {
        numberOfBooks++;
        System.out.println("Book returned. Total books: " + numberOfBooks);
    }

    public static void main(String[] args) {
        Q_084_Library lib = new Q_084_Library("City Library", 3);
        lib.issueBook();
        lib.issueBook();
        lib.returnBook();
        lib.issueBook();
        lib.issueBook();
        lib.issueBook();
    }
}


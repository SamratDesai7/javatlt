package org.assignment.tlt;

class Book {
    int id;
    String name;
    String author;
    String pub;
    double price;

    public Book(int id, String name, String author, String pub, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pub = pub;
        this.price = price;
    }
}

class Q_028_Library {
    private Book[] books;

    public Q_028_Library(Book... b) {
        this.books = b;
    }

    public boolean checkBookPresent(int bookId) {
        for (Book book : books) {
            if (book.id == bookId) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Basics", "James Gosling", "Sun", 450.0);
        Book b2 = new Book(102, "Python Guide", "Guido van Rossum", "O'Reilly", 550.0);
        Book b3 = new Book(103, "C++ Primer", "Bjarne Stroustrup", "Pearson", 500.0);

        Q_028_Library lib = new Q_028_Library(b1, b2, b3);

        System.out.println("Book with ID 102 present: " + lib.checkBookPresent(102));
        System.out.println("Book with ID 105 present: " + lib.checkBookPresent(105));
    }
}

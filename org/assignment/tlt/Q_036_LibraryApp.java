package org.assignment.tlt;

abstract class Library {
    protected Book[] books;

    public void setBooks(Book... books) {
        this.books = books;
    }

    public abstract int getDepositedAmount();
}

class Book {
    private static int count = 0;
    private int id;
    private String name;
    private String pub;
    private int price;

    public Book(String name, String pub, int price) {
        this.id = ++count;
        this.name = name;
        this.pub = pub;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPub() { return pub; }
    public int getPrice() { return price; }
}

class Student extends Library {
    @Override
    public int getDepositedAmount() {
        if (books == null) return 0;
        return books.length * 200;
    }
}

class Employee extends Library {
    @Override
    public int getDepositedAmount() {
        if (books == null) return 0;
        return books.length * 300;
    }
}

public class Q_036_LibraryApp {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Pub1", 500);
        Book b2 = new Book("Python Guide", "Pub2", 600);
        Book b3 = new Book("Data Structures", "Pub3", 700);

        Library student = new Student();
        student.setBooks(b1, b2, b3);
        System.out.println("Student Deposit: " + student.getDepositedAmount());

        Library employee = new Employee();
        employee.setBooks(b1, b2, b3);
        System.out.println("Employee Deposit: " + employee.getDepositedAmount());
    }
}

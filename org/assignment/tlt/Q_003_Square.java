package org.assignment.tlt;

import java.util.Scanner;

class Q_003_Square {

    int number;

    void acceptNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void showSquare() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }

    public static void main(String[] args) {
        Q_003_Square obj = new Q_003_Square();
        obj.acceptNumber();
        obj.showSquare();
    }
}

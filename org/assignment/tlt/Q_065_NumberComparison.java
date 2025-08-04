package org.assignment.tlt;

public class Q_065_NumberComparison {

    public static void main(String[] args) {
        compare(10, 20);
        compare(30, 15);
        compare(25, 25);
    }

    public static void compare(int a, int b) {
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }
    }
}

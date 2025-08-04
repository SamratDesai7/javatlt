package org.assignment.tlt;

public class Q_066_NumberChecker {

    public static void main(String[] args) {
        isEven(10);
        isEven(7);
    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}

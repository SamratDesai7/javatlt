package org.assignment.tlt;

public class Q239_ArithmeticSeries {
     public static void main(String[] args) {
        int start = 1;
        int difference = 3;
        int terms = 10;

        System.out.print("Arithmetic Series: ");
        for (int i = 0; i < terms; i++) {
            int term = start + i * difference;
            System.out.print(term + " ");
        }
    }
}

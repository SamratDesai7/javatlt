package org.assignment.tlt;

public class Q240_GeometricSeries {
     public static void main(String[] args) {
        int start = 1;
        int ratio = 2;
        int terms = 10;

        System.out.print("Geometric Series: ");
        for (int i = 0; i < terms; i++) {
            int term = start * (int)Math.pow(ratio, i);
            System.out.print(term + " ");
        }
    }
}

package org.assignment.tlt;

public class Q196_SymmetricAlphabetPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }
}

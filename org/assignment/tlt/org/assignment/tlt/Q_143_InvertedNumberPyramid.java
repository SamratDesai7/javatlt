package org.assignment.tlt;

public class Q_143_InvertedNumberPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}

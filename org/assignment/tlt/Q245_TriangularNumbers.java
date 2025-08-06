package org.assignment.tlt;

public class Q245_TriangularNumbers {
     public static void main(String[] args) {
        int n = 15;

        System.out.print("First 15 Triangular Numbers: ");
        for (int i = 1; i <= n; i++) {
            int triangular = i * (i + 1) / 2;
            System.out.print(triangular + " ");
        }
    }
}

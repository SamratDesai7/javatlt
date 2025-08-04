package org.assignment.tlt;

import java.util.Scanner;

public class Q242_GeometricSum {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the common ratio (r): ");
        int r = scanner.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double sum;

        if (r == 1) {
            sum = a * n;
        } else {
            sum = a * (1 - Math.pow(r, n)) / (1 - r);
        }

        System.out.println("Sum of the first " + n + " terms: " + sum);
    }
}

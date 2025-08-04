package org.assignment.tlt;

import java.util.Scanner;

public class Q241_ArithmeticSum {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = n * (2 * a + (n - 1) * d) / 2;

        System.out.println("Sum of the first " + n + " terms: " + sum);
    }
}

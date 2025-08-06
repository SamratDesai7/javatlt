package org.assignment.tlt;

import java.util.Scanner;

public class Q246_arithmetic_progression {
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();

        System.out.print("Enter the term number (n): ");
        int n = scanner.nextInt();

        int nthTerm = a + (n - 1) * d;

        System.out.println("The " + n + "th term of the AP is: " + nthTerm);
    }
}

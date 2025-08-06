package org.assignment.tlt;

import java.util.Scanner;

public class Q234_DigitProduct {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }

        System.out.println("Product of digits: " + product);
    }
}

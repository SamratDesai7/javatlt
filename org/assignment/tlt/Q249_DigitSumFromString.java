package org.assignment.tlt;

import java.util.Scanner;

public class Q249_DigitSumFromString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int sum = 0;

        System.out.print("Digits extracted and summed: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum += digit;
                System.out.print(digit);
                if (i < input.length() - 1) {
                    System.out.print(" + ");
                }
            }
        }

        System.out.println(" = " + sum);
    }
}

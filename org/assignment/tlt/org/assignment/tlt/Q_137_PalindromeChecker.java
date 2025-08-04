package org.assignment.tlt;

import java.util.Scanner;

public class Q_137_PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();

        String reversed = "";
        int len = input.length();

        for (int i = len - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}

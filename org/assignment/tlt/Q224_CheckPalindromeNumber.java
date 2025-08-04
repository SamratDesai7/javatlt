package org.assignment.tlt;

public class Q224_CheckPalindromeNumber {
    public static void main(String[] args) {
        int number = 121; // change as needed
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(original + " is palindrome? " + (original == reversed));
    }
}

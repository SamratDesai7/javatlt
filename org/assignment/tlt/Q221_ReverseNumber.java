package org.assignment.tlt;

public class Q221_ReverseNumber {
    public static void main(String[] args) {
        int number = 123; // change as needed
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}

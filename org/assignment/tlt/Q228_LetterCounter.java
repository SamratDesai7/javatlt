package org.assignment.tlt;

import java.util.Scanner;

public class Q228_LetterCounter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        System.out.print("Enter a letter to count: ");
        char target = scanner.next().toLowerCase().charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("The letter '" + target + "' appears " + count + " times.");
    }
}

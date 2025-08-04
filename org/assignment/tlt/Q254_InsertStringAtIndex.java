package org.assignment.tlt;

import java.util.Scanner;

public class Q254_InsertStringAtIndex {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String original = sc.nextLine();

        System.out.print("Enter string to be inserted: ");
        String toInsert = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        String result = "";

        for (int i = 0; i < original.length(); i++) {
            if (i == index) {
                result += toInsert;
            }
            result += original.charAt(i);
        }

        if (index >= original.length()) {
            result = original + toInsert;
        }

        System.out.println("Result: " + result);
    }
}

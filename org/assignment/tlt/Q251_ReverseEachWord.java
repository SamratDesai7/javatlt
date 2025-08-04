package org.assignment.tlt;

import java.util.Scanner;

public class Q251_ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input += " "; 

        String word = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word = "";
            }
        }
    }
}

package org.assignment.tlt;

import java.util.Scanner;

public class Q253_EvenLengthWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + " ";

        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() % 2 == 0) {
                    System.out.print(word + " ");
                }
                word = "";
            }
        }
    }
}

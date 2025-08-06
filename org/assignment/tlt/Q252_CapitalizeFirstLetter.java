package org.assignment.tlt;

import java.util.Scanner;

public class Q252_CapitalizeFirstLetter {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";

        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.isEmpty()) {
                    char first = word.charAt(0);
                    if (first >= 'a' && first <= 'z') {
                        first = (char)(first - 32);
                    }
                    System.out.print(first);
                    for (int j = 1; j < word.length(); j++) {
                        System.out.print(word.charAt(j));
                    }
                    System.out.print(" ");
                    word = "";
                }
            }
        }
    }
}

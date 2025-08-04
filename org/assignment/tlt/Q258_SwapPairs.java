package org.assignment.tlt;

import java.util.Scanner;

public class Q258_SwapPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i += 2) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i));
        }
        if (str.length() % 2 != 0) {
            result.append(str.charAt(str.length() - 1));
        }

        System.out.println(result.toString());
    }
}

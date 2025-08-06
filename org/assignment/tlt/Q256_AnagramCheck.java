package org.assignment.tlt;

import java.util.Arrays;
import java.util.Scanner;

public class Q256_AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.println("No");
            return;
        }

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

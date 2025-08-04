package org.assignment.tlt;

import java.util.Scanner;

public class Q262_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}

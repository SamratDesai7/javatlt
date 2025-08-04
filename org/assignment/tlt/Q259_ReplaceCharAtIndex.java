package org.assignment.tlt;

import java.util.Scanner;

public class Q259_ReplaceCharAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int index = sc.nextInt();
        char ch = sc.next().charAt(0);

        if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index");
            return;
        }

        String result = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(result);
    }
}

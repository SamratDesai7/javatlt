package org.assignment.tlt;

import java.util.Arrays;
import java.util.Scanner;

public class Q261_SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String sorted = new String(chars);
        System.out.println(sorted);
    }
}

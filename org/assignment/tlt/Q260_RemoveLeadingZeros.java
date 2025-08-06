package org.assignment.tlt;

import java.util.Scanner;

public class Q260_RemoveLeadingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = str.replaceFirst("^0+", "");
        System.out.println(result);
    }
}

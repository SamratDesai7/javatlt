package org.assignment.tlt;

public class Q190_CharPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

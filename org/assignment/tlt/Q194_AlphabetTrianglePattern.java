package org.assignment.tlt;

public class Q194_AlphabetTrianglePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

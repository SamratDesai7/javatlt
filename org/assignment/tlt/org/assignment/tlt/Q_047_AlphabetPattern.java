package org.assignment.tlt;

public class Q_047_AlphabetPattern {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i <= rows; i++) {
            
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

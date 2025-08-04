package org.assignment.tlt;

public class Q192_ReverseAlphabetPattern {
    public static void main(String[] args) {
        for (char ch = 'D'; ch >= 'A'; ch--) {
            for (char j = 'A'; j <= ch; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

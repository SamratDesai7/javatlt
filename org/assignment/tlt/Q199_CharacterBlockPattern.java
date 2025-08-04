package org.assignment.tlt;

public class Q199_CharacterBlockPattern {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((char) (ch + i));
            }
            System.out.println();
        }
    }
}

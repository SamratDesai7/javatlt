package org.assignment.tlt;

public class Q226_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1 to 5):\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}

package org.assignment.tlt;

public class Q_050_NumberPattern {

    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            int[] row = new int[5];
            for (int j = 0; j < 5; j++) {
                row[j] = num++;
            }
            if (i % 2 == 0) {
                for (int j = 4; j >= 0; j--) {
                    System.out.print(row[j] + " ");
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print(row[j] + " ");
                }
            }
            System.out.println();
        }
    }
}

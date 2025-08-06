package org.assignment.tlt;

public class Q208_NumberTriangle {
    public static void main(String[] args) {
        int count = 1;
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

package org.assignment.tlt;

import java.util.Scanner;

public class Q247_HarmonicSeries {
    public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms (N): ");
        int n = scanner.nextInt();

        System.out.print("Harmonic Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
    }
    }
}

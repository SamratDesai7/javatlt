package org.assignment.tlt;

import java.util.Scanner;

public class Q229_AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to average: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);
    }
}

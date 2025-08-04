package org.assignment.tlt;

import java.util.Scanner;

public class Q_051_StrongNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;
        int sum = 0;

        while (count < n) {
            if (isStrong(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of first " + n + " strong numbers: " + sum);
    }

    static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    static int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}

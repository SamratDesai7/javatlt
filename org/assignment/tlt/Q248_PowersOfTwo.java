package org.assignment.tlt;

import java.util.Scanner;

public class Q248_PowersOfTwo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum power (N): ");
        int n = scanner.nextInt();

        System.out.print("Powers of 2: ");
        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(2, i);
            System.out.print(result + " ");
        }
    }
}

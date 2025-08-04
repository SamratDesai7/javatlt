package org.assignment.tlt;

import java.util.Scanner;

public class Q_056_ArrayReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

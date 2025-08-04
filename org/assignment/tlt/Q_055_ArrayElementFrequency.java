package org.assignment.tlt;

import java.util.Scanner;

public class Q_055_ArrayElementFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int[] freq = new int[10];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            freq[i] = -1;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] == -1) {
                int count = 1;
                for (int j = i + 1; j < 10; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }

        System.out.println("Element frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                System.out.println(arr[i] + " => " + freq[i]);
            }
        }
    }
}

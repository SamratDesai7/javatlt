package org.assignment.tlt;

import java.util.Scanner;

public class Q_054_ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter search key: ");
        int key = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Key not found in array.");
        }
    }
}

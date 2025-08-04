package org.assignment.tlt;

import java.util.Scanner;

public class Q_049_DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] freq = new int[10]; 

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }

        System.out.println("Digit frequencies in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }
    }
}

package org.assignment.tlt;

import java.util.Scanner;

public class Q_131_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, sum = 0;

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
          sc.close();
    }

  
}

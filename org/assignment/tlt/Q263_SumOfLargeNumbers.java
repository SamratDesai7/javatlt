package org.assignment.tlt;

import java.util.Scanner;

public class Q263_SumOfLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        System.out.println(result.reverse().toString());
    }
}

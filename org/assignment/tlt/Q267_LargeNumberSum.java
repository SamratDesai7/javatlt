package org.assignment.tlt;

public class Q267_LargeNumberSum {
    public static void main(String[] args) {
        String str1 = "7777555511111111";
        String str2 = "3332222221111";

        String result = addLargeNumbers(str1, str2);
        System.out.println("Output: " + result);
    }

    static String addLargeNumbers(String num1, String num2) {
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

        return result.reverse().toString();
    }
}

package org.assignment.tlt;

public class Q269_AddBinaryStrings {
    public static void main(String[] args) {
        String str1 = "1001";
        String str2 = "11";
        String result = addBinary(str1, str2);
        System.out.println("Output: " + result);
    }

    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}

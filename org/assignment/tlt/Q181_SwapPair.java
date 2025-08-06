package org.assignment.tlt;

import java.util.Scanner;

public class Q181_SwapPair {

    static class SwapPair {
        private String data;

        public void setString(String data) {
            this.data = data;
        }

        public String getRevPairData() {
            if (data == null || data.length() < 2) return data;

            char[] chars = data.toCharArray();
            for (int i = 0; i < chars.length - 1; i += 2) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
            }
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SwapPair sp = new SwapPair();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        sp.setString(input);
        String swapped = sp.getRevPairData();

        System.out.println("Swapped Pairs: " + swapped);
        scanner.close();
    }
}

package org.assignment.tlt;

import java.util.Scanner;

public class Q182_ReplaceChar {

    static class ReplaceChar {
        private String data;

        public void setString(String data) {
            this.data = data;
        }

        public void insertCharIndex(int index, char ch) {
            if (data == null || index < 0 || index >= data.length()) {
                System.out.println("Invalid index.");
                return;
            }

            StringBuilder sb = new StringBuilder(data);
            sb.setCharAt(index, ch);
            data = sb.toString();

            System.out.println("Updated String: " + data);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReplaceChar rc = new ReplaceChar();

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter index to replace: ");
        int index = scanner.nextInt();

        System.out.print("Enter new character: ");
        char ch = scanner.next().charAt(0);

        rc.setString(input);
        rc.insertCharIndex(index, ch);

        scanner.close();
    }
}

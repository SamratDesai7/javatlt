package org.assignment.tlt;

import java.util.Scanner;

public class Q180_RevString {
    
    static class RevString {
        private String data;

        public void setString(String data) {
            this.data = data;
        }

        public String getRevString() {
            if (data == null) return "";
            StringBuilder reversed = new StringBuilder(data);
            return reversed.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RevString revObj = new RevString();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        revObj.setString(input);
        String reversed = revObj.getRevString();

        System.out.println("Reversed String: " + reversed);
        scanner.close();
    }
}


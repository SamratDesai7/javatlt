package org.assignment.tlt;

import java.util.Scanner;

public class Q185_RemoveLeadingZero {
    private String str;

    public void setString(String str) {
        this.str = str;
    }

    public void removeLeadingZero() {
        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input.");
            return;
        }

        String result = str.replaceFirst("^0+", "");
        System.out.println("Output: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q185_RemoveLeadingZero obj = new Q185_RemoveLeadingZero();

        System.out.print("Enter a numeric string: ");
        String input = sc.nextLine();

        obj.setString(input);
        obj.removeLeadingZero();
        sc.close();
    }
}

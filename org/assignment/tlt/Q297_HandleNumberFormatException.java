package org.assignment.tlt;

public class Q297_HandleNumberFormatException {
    public static void main(String[] args) {
        String str = "123a";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format.");
        }
    }
}

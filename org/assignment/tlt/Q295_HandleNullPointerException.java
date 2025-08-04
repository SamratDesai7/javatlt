package org.assignment.tlt;

public class Q295_HandleNullPointerException {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: String is null.");
        }
    }
}

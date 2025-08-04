package org.assignment.tlt;

public class Q_071_ConvertToUppercase {
    public static void main(String[] args) {
        char[] chars = "Java Programming".toCharArray();
        convertToUppercase(chars);
        System.out.println(chars);
    }

    public static void convertToUppercase(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
    }
}

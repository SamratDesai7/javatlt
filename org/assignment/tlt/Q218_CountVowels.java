package org.assignment.tlt;

public class Q218_CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}

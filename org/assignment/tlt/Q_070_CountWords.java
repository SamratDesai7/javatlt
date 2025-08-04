package org.assignment.tlt;

public class Q_070_CountWords {
    public static void main(String[] args) {
        char[] chars = "Java is a powerful language".toCharArray();
        System.out.println("Word count: " + countWords(chars));
    }

    public static int countWords(char[] chars) {
        int count = 0;
        boolean inWord = false;

        for (char c : chars) {
            if (c != ' ') {
                if (!inWord) {
                    inWord = true;
                    count++;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}

package org.assignment.tlt;

class Upper {
    private char[] data;

    public Upper(char[] input) {
        this.data = input;
    }

    public char[] getUpperCase() {
        char[] upperData = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'a' && data[i] <= 'z') {
                upperData[i] = (char) (data[i] - 32);
            } else {
                upperData[i] = data[i];
            }
        }
        return upperData;
    }
}

public class Q_026_UpperApplication {
    public static void main(String[] args) {
        char[] input = { 'h', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
        Upper upper = new Upper(input);
        char[] result = upper.getUpperCase();

        System.out.print("Uppercase: ");
        for (char c : result) {
            System.out.print(c);
        }
    }
}

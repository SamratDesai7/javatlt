package org.assignment.tlt;

public class Q_062_CountDigitsRecursion {

    public static void main(String[] args) {
        int number = 123456;
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
    }

    public static int countDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + countDigits(num / 10);
    }
}

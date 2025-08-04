package org.assignment.tlt;

public class Q_046_SwapDigits {

    static int swapFirstLastTwoDigits(int num) {
        String str = String.valueOf(num);
        int len = str.length();

        if (len < 4) {
            System.out.println("Number must have at least 4 digits.");
            return num;
        }

        String firstTwo = str.substring(0, 2);
        String middle = str.substring(2, len - 2);
        String lastTwo = str.substring(len - 2);

        String swapped = lastTwo + middle + firstTwo;
        return Integer.parseInt(swapped);
    }

    public static void main(String[] args) {
        int number = 12345;
        int swappedNumber = swapFirstLastTwoDigits(number);
        System.out.println("After swapping: " + swappedNumber);
    }
}

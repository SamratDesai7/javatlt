package org.assignment.tlt;

class Q_008_DigitCount {

    int number;

    void setValue(int num) {
        number = num;
    }

    int getDigitCount() {
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) return 1;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Q_008_DigitCount obj = new Q_008_DigitCount();
        obj.setValue(12345);
        System.out.println("Digit count: " + obj.getDigitCount());
    }
}

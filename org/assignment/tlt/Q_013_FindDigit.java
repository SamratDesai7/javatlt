package org.assignment.tlt;

class Q_013_FindDigit {

    int value;

    void setValue(int value) {
        this.value = value;
    }

    boolean isDigitPresent(int digit) {
        int temp = Math.abs(value);
        while (temp != 0) {
            int d = temp % 10;
            if (d == digit) return true;
            temp /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Q_013_FindDigit obj = new Q_013_FindDigit();
        obj.setValue(48293);
        System.out.println("Is digit 2 present? " + obj.isDigitPresent(2));
        System.out.println("Is digit 7 present? " + obj.isDigitPresent(7));
    }
}

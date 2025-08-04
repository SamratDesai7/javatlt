package org.assignment.tlt;

class Q_007_Armstrong {

    int number;

    void setNumber(int no) {
        number = no;
    }

    boolean isArmstrong() {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Q_007_Armstrong obj = new Q_007_Armstrong();
        obj.setNumber(153);
        System.out.println("Is Armstrong: " + obj.isArmstrong());
    }
}

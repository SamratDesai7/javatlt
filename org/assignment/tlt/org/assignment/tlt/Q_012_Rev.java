package org.assignment.tlt;

class Q_012_Rev {

    int number;

    void setNum(int no) {
        number = no;
    }

    int getRev() {
        int rev = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Q_012_Rev obj = new Q_012_Rev();
        obj.setNum(1234);
        System.out.println("Reversed number: " + obj.getRev());
    }
}

package org.assignment.tlt;

class Q_014_DuckNum {

    int number;

    void setValue(int no) {
        number = no;
    }

    boolean isDuck() {
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit == 0) return true;
            temp /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        Q_014_DuckNum obj = new Q_014_DuckNum();
        obj.setValue(2045);
        System.out.println("Is Duck Number: " + obj.isDuck());

        obj.setValue(1234);
        System.out.println("Is Duck Number: " + obj.isDuck());
    }
}

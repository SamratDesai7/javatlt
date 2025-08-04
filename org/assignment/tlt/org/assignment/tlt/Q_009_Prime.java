package org.assignment.tlt;

class Q_009_Prime {

    int number;

    void setValue(int no) {
        number = no;
    }

    boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q_009_Prime obj = new Q_009_Prime();
        obj.setValue(29);
        System.out.println("Is Prime: " + obj.isPrime());
    }
}

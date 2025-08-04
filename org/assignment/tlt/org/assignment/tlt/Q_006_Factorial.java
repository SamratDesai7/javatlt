package org.assignment.tlt;

class Q_006_Factorial {

    int number;

    void setValue(int num) {
        number = num;
    }

    void showFactorial() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    public static void main(String[] args) {
        Q_006_Factorial obj = new Q_006_Factorial();
        obj.setValue(5);
        obj.showFactorial();
    }
}

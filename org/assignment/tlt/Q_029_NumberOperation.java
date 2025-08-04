package org.assignment.tlt;

class Q_029_NumberOperation {
    private int no;
    private int base;
    private int index;
    private boolean isFactorial;

    public Q_029_NumberOperation(int no) {
        this.no = no;
        this.isFactorial = true;
    }

    public Q_029_NumberOperation(int base, int index) {
        this.base = base;
        this.index = index;
        this.isFactorial = false;
    }

    public int getFactorial() {
        if (!isFactorial) return -1;
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact *= i;
        }
        return fact;
    }

    public int getPower() {
        if (isFactorial) return -1;
        int result = 1;
        for (int i = 0; i < index; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Q_029_NumberOperation factOp = new Q_029_NumberOperation(5);
        Q_029_NumberOperation powerOp = new Q_029_NumberOperation(2, 4);

        System.out.println("Factorial of 5 = " + factOp.getFactorial());
        System.out.println("2 raised to power 4 = " + powerOp.getPower());
    }
}

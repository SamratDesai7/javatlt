package org.assignment.tlt;

class Q_011_Fibo {

    int limit;

    void setLimit(int limit) {
        this.limit = limit;
    }

    void showFibo() {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + limit + ": ");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q_011_Fibo obj = new Q_011_Fibo();
        obj.setLimit(10);
        obj.showFibo();
    }
}

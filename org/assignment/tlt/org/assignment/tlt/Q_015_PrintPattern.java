package org.assignment.tlt;

class Q_015_PrintPattern {

    int row, col;

    void setValue(int row, int col) {
        this.row = row;
        this.col = col;
    }

    void printPattern() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q_015_PrintPattern obj = new Q_015_PrintPattern();
        obj.setValue(4, 5);
        obj.printPattern();
    }
}

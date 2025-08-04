package org.assignment.tlt;

class Q_005_Table {

    int number;

    void setNum(int num) {
        number = num;
    }

    void showTable() {
        System.out.println("Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Q_005_Table obj = new Q_005_Table();
        obj.setNum(7);
        obj.showTable();
    }
}

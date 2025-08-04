package org.assignment.tlt;

class Q_019_Min {

    int[] array;

    void setArray(int a[]) {
        array = a;
    }

    int getMin() {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Q_019_Min obj = new Q_019_Min();
        int[] input = {45, 12, 78, 3, 25};
        obj.setArray(input);
        System.out.println("Minimum value: " + obj.getMin());
    }
}

package org.assignment.tlt;

class Q_017_Rev {

    int[] array;

    void setArray(int a[]) {
        array = a;
    }

    void rev() {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    void display() {
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q_017_Rev obj = new Q_017_Rev();
        int[] input = {1, 2, 3, 4, 5};
        obj.setArray(input);
        obj.rev();
        obj.display();
    }
}

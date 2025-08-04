package org.assignment.tlt;

class ArrSum {
    int[] arr;

    void setValue(int arr[]) {
        this.arr = arr;
    }
}

class GetSum extends ArrSum {
    int getArrSum() {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}

public class Q_091_ArraySum {
    public static void main(String[] args) {
        GetSum obj = new GetSum();
        int[] values = {10, 20, 30, 40, 50};
        obj.setValue(values);
        System.out.println("Sum of array elements: " + obj.getArrSum());
    }
}

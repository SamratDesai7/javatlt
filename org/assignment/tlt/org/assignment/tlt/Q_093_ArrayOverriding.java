package org.assignment.tlt;

class ArrParent {
    int[] arr;

    void setValue(int arr[]) {
        this.arr = arr;
    }

    void arrangeSeq() {
        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class ArrangeAscendingOrder extends ArrParent {
    @Override
    void arrangeSeq() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array in Ascending Order:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class ReverseArray extends ArrParent {
    @Override
    void arrangeSeq() {
        System.out.println("Array in Reverse Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Q_093_ArrayOverriding {
    public static void main(String[] args) {
        int[] values = {40, 10, 30, 20, 50};

        ArrangeAscendingOrder asc = new ArrangeAscendingOrder();
        asc.setValue(values.clone());
        asc.arrangeSeq();

        ReverseArray rev = new ReverseArray();
        rev.setValue(values.clone());
        rev.arrangeSeq();
    }
}

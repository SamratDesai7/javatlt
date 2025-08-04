package org.assignment.tlt;

class Q_018_Merge {

    int[] mergedArray;

    void acceptArray(int a[], int b[]) {
        mergedArray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            mergedArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            mergedArray[a.length + i] = b[i];
        }
    }

    void merge() {
        // Already merged in acceptArray, nothing to do here for basic merging
    }

    void display() {
        System.out.print("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q_018_Merge obj = new Q_018_Merge();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        obj.acceptArray(arr1, arr2);
        obj.merge();
        obj.display();
    }
}

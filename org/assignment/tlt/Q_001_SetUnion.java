package org.assignment.tlt;

class Q_001_SetUnion {

    static void setOperation(int a[], int b[]) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int i : a) set.add(i);
        for (int i : b) set.add(i);
        System.out.print("Union of integer arrays: ");
        for (int i : set) System.out.print(i + " ");
        System.out.println();
    }

    static void setOperation(char a[], char b[]) {
        java.util.Set<Character> set = new java.util.HashSet<>();
        for (char c : a) set.add(c);
        for (char c : b) set.add(c);
        System.out.print("Union of character arrays: ");
        for (char c : set) System.out.print(c + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        setOperation(arr1, arr2);

        char[] arr3 = {'a', 'b', 'c'};
        char[] arr4 = {'b', 'c', 'd'};
        setOperation(arr3, arr4);
    }
}

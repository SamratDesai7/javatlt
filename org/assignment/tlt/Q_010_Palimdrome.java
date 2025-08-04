package org.assignment.tlt;

class Q_010_Palimdrome {

    int number;

    void setValue(int no) {
        number = no;
    }

    boolean isPalim() {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Q_010_Palimdrome obj = new Q_010_Palimdrome();
        obj.setValue(121);
        System.out.println("Is Palindrome: " + obj.isPalim());
    }
}

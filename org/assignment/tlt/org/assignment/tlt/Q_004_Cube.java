package org.assignment.tlt;

import java.util.Scanner;

class Q_004_Cube {

    int number;

    void acceptNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void showCube() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }

    public static void main(String[] args) {
        Q_004_Cube obj = new Q_004_Cube();
        obj.acceptNumber();
        obj.showCube();
    }
}

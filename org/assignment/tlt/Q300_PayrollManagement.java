package org.assignment.tlt;

import java.util.Scanner;

class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

public class Q300_PayrollManagement {
    static void addEmployee(int age) throws AgeInvalidException {
        if (age < 16) {
            throw new AgeInvalidException("Employee age must be 16 or above to be added.");
        } else {
            System.out.println("Employee added successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();

        try {
            addEmployee(age);
        } catch (AgeInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

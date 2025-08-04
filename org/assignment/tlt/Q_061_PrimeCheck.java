package org.assignment.tlt;

public class Q_061_PrimeCheck {

    public static void main(String[] args) {
        int number1 = 29;
        int number2 = 40;

        System.out.println(isPrime(number1)); // true
        System.out.println(isPrime(number2)); // false
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

package org.assignment.tlt;

public class Q_083_Primenum {
  
    int num;

   
    Q_083_Primenum(int num) {
        this.num = num;
    }

    
    void checkPrime() {
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

   
    public static void main(String[] args) {
        Q_083_Primenum obj1 = new Q_083_Primenum(29);
        obj1.checkPrime();

        Q_083_Primenum obj2 = new Q_083_Primenum(30);
        obj2.checkPrime();
    }
}

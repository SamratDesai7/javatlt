package org.assignment.tlt;

public class Q_088_MileageCalculator {
    String make;
    String model;
    double milesDriven;
    double fuelUsed;

    Q_088_MileageCalculator(String make, String model, double milesDriven, double fuelUsed) {
        this.make = make;
        this.model = model;
        this.milesDriven = milesDriven;
        this.fuelUsed = fuelUsed;
    }

    void calculateMileage() {
        if (fuelUsed == 0) {
            System.out.println("Fuel used cannot be zero. Cannot calculate mileage.");
        } else {
            double mileage = milesDriven / fuelUsed;
            System.out.println("Car Make: " + make);
            System.out.println("Car Model: " + model);
            System.out.println("Mileage: " + mileage + " miles/gallon");
        }
    }

    public static void main(String[] args) {
        Q_088_MileageCalculator car1 = new Q_088_MileageCalculator("Toyota", "Corolla", 300, 10);
        car1.calculateMileage();

        Q_088_MileageCalculator car2 = new Q_088_MileageCalculator("Honda", "Civic", 250, 0);
        car2.calculateMileage();
    }
}

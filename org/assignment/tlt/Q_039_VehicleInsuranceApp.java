package org.assignment.tlt;

class Vehicle {
    protected String type;
    protected int age;

    void setDetails(String type, int age) {
        this.type = type;
        this.age = age;
    }

    int insuranceCost() {
        return 0;
    }
}

class Car extends Vehicle {
    @Override
    int insuranceCost() {
        int baseCost = 5000;
        if (age > 5) {
            baseCost += 2000;
        }
        return baseCost;
    }
}

class Bike extends Vehicle {
    @Override
    int insuranceCost() {
        int baseCost = 2000;
        if (age > 3) {
            baseCost += 1000;
        }
        return baseCost;
    }
}

public class Q_039_VehicleInsuranceApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setDetails("Car", 6);
        System.out.println("Car Insurance Cost: " + car.insuranceCost());

        Vehicle bike = new Bike();
        bike.setDetails("Bike", 4);
        System.out.println("Bike Insurance Cost: " + bike.insuranceCost());
    }
}

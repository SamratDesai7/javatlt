package org.assignment.tlt;

class Animal {
    String species;
    String habitat;

    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public void displayDetails() {
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
    }
}

class Bird extends Animal {
    double wingSpan; // in meters
    double flightSpeed; // in km/h

    public Bird(String species, String habitat, double wingSpan, double flightSpeed) {
        super(species, habitat);
        this.wingSpan = wingSpan;
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wing Span: " + wingSpan + " meters");
        System.out.println("Flight Speed: " + flightSpeed + " km/h");
    }
}

public class Q_116_AnimalBird {
    public static void main(String[] args) {
        Animal animal = new Animal("Tiger", "Forest");
        animal.displayDetails();

        System.out.println();

        Bird bird = new Bird("Eagle", "Mountains", 2.3, 120.5);
        bird.displayDetails();
    }
}

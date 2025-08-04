package org.assignment.tlt;

public class Q_077_CalCircumference {
    // Instance variable
    double radius;

    
    Q_077_CalCircumference() {
        radius = 10;
    }

   
    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }

    
    public static void main(String[] args) {
        Q_077_CalCircumference circle = new Q_077_CalCircumference(); 
        circle.calculateCircumference(); 
    }
}

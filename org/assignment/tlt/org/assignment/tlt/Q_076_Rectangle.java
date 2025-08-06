package org.assignment.tlt;

class Q_076_Rectangle{
    int length;
    int breadth;

    
    Q_076_Rectangle() {
        length = 5;
        breadth = 5;
    }

   
    void area() {
        int result = length * breadth;
        System.out.println("Area of rectangle: " + result);
    }

   
    public static void main(String[] args) {
        Q_076_Rectangle rect = new Q_076_Rectangle(); 
        rect.area();
    }
}
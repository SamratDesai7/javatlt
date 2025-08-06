package org.assignment.tlt;

public class Q_082_student {
    
     int rollNo;
    int marks;

    
    Q_082_student() {
        rollNo = 1;
        marks = 75;
    }

   
    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }

   
    public static void main(String[] args) {
        Q_082_student student1 = new Q_082_student(); 
        student1.displayDetails();
    }
}





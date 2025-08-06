package org.assignment.tlt;

public class Q_078_Student {
    
    String name;
    int rollNumber;
    int marks;

    
    Q_078_Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    
    void checkResult() {
        if (marks > 40) {
            System.out.println(name + " (Roll No: " + rollNumber + ") has passed.");
        } else {
            System.out.println(name + " (Roll No: " + rollNumber + ") has failed.");
        }
    }

   
    public static void main(String[] args) {
        Q_078_Student student1 = new Q_078_Student("Prajwal", 101, 75);
        Q_078_Student student2 = new Q_078_Student("Vinay", 102, 35);

        student1.checkResult();
        student2.checkResult();
    }
}

package org.assignment.tlt;

class School {
    String schoolName;
    String address;

    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Address: " + address);
    }
}

class Teacher extends School {
    String teacherName;
    String subject;

    public Teacher(String schoolName, String address, String teacherName, String subject) {
        super(schoolName, address);
        this.teacherName = teacherName;
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Subject: " + subject);
    }
}

public class Q_114_SchoolTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Green Valley School", "Mumbai", "Mrs. Joshi", "Mathematics");
        teacher.displayInfo();
    }
}

package org.assignment.tlt;

import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String address;
    private String roomId;
    private String deptName;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getDeptName() {
        return deptName;
    }
}

interface AdmissionInterface {
    boolean isAdmitStudent(Student student);

    Student getStudent();
}

class HostelAdmission implements AdmissionInterface {
    private Student student = new Student();

    public boolean isAdmitStudent(Student s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        s.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter Address: ");
        s.setAddress(sc.nextLine());
        System.out.print("Enter Room ID: ");
        s.setRoomId(sc.nextLine());
        this.student = s;
        sc.close();
        return true;
    }

    public Student getStudent() {
        return student;
    }
}

class DeptAdmission implements AdmissionInterface {
    private Student student = new Student();

    public boolean isAdmitStudent(Student s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        s.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter Address: ");
        s.setAddress(sc.nextLine());
        System.out.print("Enter Department Name: ");
        s.setDeptName(sc.nextLine());
        this.student = s;
        sc.close();
        return true;
    }

    public Student getStudent() {
        return student;
    }
}

class College {
    public void acceptAdmission(AdmissionInterface adminInterface, String admissionType) {
        Student s = new Student();
        if (adminInterface.isAdmitStudent(s)) {
            Student stu = adminInterface.getStudent();
            System.out.println("\n--- Admission Successful ---");
            System.out.println("ID: " + stu.getId());
            System.out.println("Name: " + stu.getName());
            System.out.println("Address: " + stu.getAddress());
            if (admissionType.equalsIgnoreCase("hostel")) {
                System.out.println("Room ID: " + stu.getRoomId());
            } else if (admissionType.equalsIgnoreCase("dept")) {
                System.out.println("Department: " + stu.getDeptName());
            }
        } else {
            System.out.println("Admission Failed");
        }
    }
}

public class Q188_CollegeAdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College college = new College();

        while (true) {
            System.out.println("\n--- College Admission Menu ---");
            System.out.println("1. Department Admission");
            System.out.println("2. Hostel Admission");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    college.acceptAdmission(new DeptAdmission(), "dept");
                    break;
                case 2:
                    college.acceptAdmission(new HostelAdmission(), "hostel");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            sc.close();
        }
    }
}

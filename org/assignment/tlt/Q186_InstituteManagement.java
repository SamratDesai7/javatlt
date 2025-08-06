package org.assignment.tlt;

import java.util.*;

class Course {
    int id;
    String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Enquiry {
    int enquiryId;
    String studentName;
    int courseId;
    boolean isAdmitted;

    public Enquiry(int enquiryId, String studentName, int courseId) {
        this.enquiryId = enquiryId;
        this.studentName = studentName;
        this.courseId = courseId;
        this.isAdmitted = false;
    }
}

class Admission {
    int enquiryId;
    String studentName;
    int courseId;

    public Admission(int enquiryId, String studentName, int courseId) {
        this.enquiryId = enquiryId;
        this.studentName = studentName;
        this.courseId = courseId;
    }
}

class Batch {
    int batchId;
    String batchName;
    int courseId;
    List<Admission> students = new ArrayList<>();

    public Batch(int batchId, String batchName, int courseId) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.courseId = courseId;
    }
}

public class Q186_InstituteManagement {
    static Scanner sc = new Scanner(System.in);
    static Course[] courses = new Course[3];
    static Enquiry[] enquiries = new Enquiry[10];
    static Admission[] admissions = new Admission[10];
    static Batch batch = null;
    static int courseCount = 0, enquiryCount = 0, admissionCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Courses\n2. Take Enquiry\n3. Enroll for Admission\n4. Allocate Batch");
            System.out.println("5. View All Courses\n6. View Course-Wise Students\n7. View Batch-Wise Students");
            System.out.println("8. View All Enquiries\n9. View All Admissions\n10. View Cancelled Enquiries\n11. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addCourses(); break;
                case 2: takeEnquiry(); break;
                case 3: enrollAdmission(); break;
                case 4: allocateBatch(); break;
                case 5: viewCourses(); break;
                case 6: viewCourseWiseStudents(); break;
                case 7: viewBatchWiseStudents(); break;
                case 8: viewAllEnquiries(); break;
                case 9: viewAllAdmissions(); break;
                case 10: viewCancelledEnquiries(); break;
                case 11: return;
                default: System.out.println("Invalid Choice!");
            }
        }
    }

    static void addCourses() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Course ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Course Name: ");
            String name = sc.nextLine();
            courses[courseCount++] = new Course(id, name);
        }
    }

    static void takeEnquiry() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Enquiry ID: ");
            int eid = sc.nextInt();
            if (isDuplicateEnquiryId(eid)) {
                System.out.println("Duplicate Enquiry ID!");
                i--;
                continue;
            }
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            viewCourses();
            System.out.print("Enter Course ID: ");
            int cid = sc.nextInt();
            enquiries[enquiryCount++] = new Enquiry(eid, name, cid);
        }
    }

    static boolean isDuplicateEnquiryId(int id) {
        for (int i = 0; i < enquiryCount; i++) {
            if (enquiries[i].enquiryId == id)
                return true;
        }
        return false;
    }

    static void enrollAdmission() {
        for (int i = 0; i < enquiryCount; i++) {
            Enquiry e = enquiries[i];
            if (!e.isAdmitted) {
                System.out.println("Enquiry ID: " + e.enquiryId + ", Name: " + e.studentName);
            }
        }
        System.out.print("Enter Enquiry ID to admit: ");
        int id = sc.nextInt();
        for (int i = 0; i < enquiryCount; i++) {
            if (enquiries[i].enquiryId == id && !enquiries[i].isAdmitted) {
                enquiries[i].isAdmitted = true;
                admissions[admissionCount++] = new Admission(id, enquiries[i].studentName, enquiries[i].courseId);
                System.out.println("Admission Successful.");
                return;
            }
        }
        System.out.println("Invalid or already admitted Enquiry ID.");
    }

    static void allocateBatch() {
        System.out.print("Enter Batch ID: ");
        int bid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Batch Name: ");
        String bname = sc.nextLine();
        viewCourses();
        System.out.print("Enter Course ID to assign batch: ");
        int cid = sc.nextInt();

        batch = new Batch(bid, bname, cid);
        for (int i = 0; i < admissionCount; i++) {
            if (admissions[i].courseId == cid)
                batch.students.add(admissions[i]);
        }
        System.out.println("Batch allocated.");
    }

    static void viewCourses() {
        System.out.println("Available Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("ID: " + courses[i].id + ", Name: " + courses[i].name);
        }
    }

    static void viewCourseWiseStudents() {
        viewCourses();
        System.out.print("Enter Course ID: ");
        int cid = sc.nextInt();
        for (int i = 0; i < admissionCount; i++) {
            if (admissions[i].courseId == cid) {
                System.out.println("Student: " + admissions[i].studentName);
            }
        }
    }

    static void viewBatchWiseStudents() {
        if (batch == null) {
            System.out.println("No Batch Allocated Yet.");
            return;
        }
        System.out.println("Batch ID: " + batch.batchId + ", Name: " + batch.batchName);
        for (Admission a : batch.students) {
            System.out.println("Student: " + a.studentName);
        }
    }

    static void viewAllEnquiries() {
        for (int i = 0; i < enquiryCount; i++) {
            Enquiry e = enquiries[i];
            System.out.println("ID: " + e.enquiryId + ", Name: " + e.studentName + ", Course ID: " + e.courseId + ", Status: " + (e.isAdmitted ? "Admitted" : "Pending"));
        }
    }

    static void viewAllAdmissions() {
        for (int i = 0; i < admissionCount; i++) {
            Admission a = admissions[i];
            System.out.println("Enquiry ID: " + a.enquiryId + ", Student: " + a.studentName + ", Course ID: " + a.courseId);
        }
    }

    static void viewCancelledEnquiries() {
        for (int i = 0; i < enquiryCount; i++) {
            if (!enquiries[i].isAdmitted) {
                System.out.println("Enquiry ID: " + enquiries[i].enquiryId + ", Student: " + enquiries[i].studentName);
            }
        }
    }
}

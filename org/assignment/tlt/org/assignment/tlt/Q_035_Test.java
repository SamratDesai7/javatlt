package org.assignment.tlt;

abstract class Q_035_Coupen {
    protected Q_035_Course[] courses;
    protected String userType;

    public void setCourse(Q_035_Course[] courses, String userType) {
        this.courses = courses;
        this.userType = userType;
    }

    public abstract int getBill();
}

class Q_035_Course {
    private int id;
    private String name;
    private int fees;

    public Q_035_Course(int id, String name, int fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFees() {
        return fees;
    }
}

class Q_035_Student extends Q_035_Coupen {
    @Override
    public int getBill() {
        if (courses == null || courses.length == 0)
            return 0;
        int total = 0;
        if (courses.length > 3) {
            for (Q_035_Course course : courses) {
                total += course.getFees() * 80 / 100;
            }
        } else {
            for (Q_035_Course course : courses) {
                total += course.getFees();
            }
        }
        return total;
    }
}

class Q_035_Employee extends Q_035_Coupen {
    @Override
    public int getBill() {
        if (courses == null || courses.length == 0)
            return 0;
        int total = 0;
        if (courses.length > 5) {
            for (Q_035_Course course : courses) {
                total += course.getFees() * 90 / 100;
            }
        } else {
            for (Q_035_Course course : courses) {
                total += course.getFees();
            }
        }
        return total;
    }
}

public class Q_035_Test {
    public static void main(String[] args) {
        Q_035_Course[] studentCourses = {
            new Q_035_Course(1, "Java", 1000),
            new Q_035_Course(2, "Python", 1200),
            new Q_035_Course(3, "JS", 800),
            new Q_035_Course(4, "C++", 900),
        };

        Q_035_Coupen student = new Q_035_Student();
        student.setCourse(studentCourses, "Student");
        System.out.println("Student Bill: " + student.getBill());

        Q_035_Course[] employeeCourses = {
            new Q_035_Course(1, "Java", 1000),
            new Q_035_Course(2, "Python", 1200),
            new Q_035_Course(3, "JS", 800),
            new Q_035_Course(4, "C++", 900),
            new Q_035_Course(5, "HTML", 700),
            new Q_035_Course(6, "CSS", 600),
        };

        Q_035_Coupen employee = new Q_035_Employee();
        employee.setCourse(employeeCourses, "Employee");
        System.out.println("Employee Bill: " + employee.getBill());
    }
}

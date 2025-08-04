package org.assignment.tlt;

class Q_022_Student {
    private int id;
    private String name;
    private int[] sub = new int[6];

    public Q_022_Student(int id, String name, int[] sub) {
        this.id = id;
        this.name = name;
        this.sub = sub;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public double getPercentage() {
        int total = 0;
        for (int mark : sub) {
            total += mark;
        }
        return (total / 6.0);
    }
}

public class Q_022_StudentPercentage {
    public static void main(String[] args) {
        Q_022_Student[] students = new Q_022_Student[5];

        students[0] = new Q_022_Student(1, "Alice", new int[]{85, 78, 90, 88, 92, 84});
        students[1] = new Q_022_Student(2, "Bob", new int[]{76, 65, 70, 80, 72, 68});
        students[2] = new Q_022_Student(3, "Charlie", new int[]{90, 88, 95, 91, 89, 93});
        students[3] = new Q_022_Student(4, "David", new int[]{55, 60, 58, 62, 59, 61});
        students[4] = new Q_022_Student(5, "Eva", new int[]{70, 75, 72, 68, 74, 73});

        System.out.printf("%-5s %-10s %-15s\n", "ID", "Name", "Percentage");
        System.out.println("------------------------------------");

        for (Q_022_Student student : students) {
            System.out.printf("%-5d %-10s %-15.2f\n", student.getId(), student.getName(), student.getPercentage());
        }
    }
}

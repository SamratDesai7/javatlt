package org.assignment.tlt;

import java.util.*;

@FunctionalInterface
interface GradeCalculator {
    String calculateGrade(List<Integer> marks);
}

class StudentGrade implements GradeCalculator {
    public String calculateGrade(List<Integer> marks) {
        double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }
}

public class Q_123_FunctionalInterface {
    public static void main(String[] args) {
        GradeCalculator calculator = new StudentGrade();
        List<Integer> marks = Arrays.asList(85, 78, 90, 92, 80);
        String grade = calculator.calculateGrade(marks);
        System.out.println("Grade: " + grade);
    }
}

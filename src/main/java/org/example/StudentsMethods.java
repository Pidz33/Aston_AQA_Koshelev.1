package org.example;


import java.util.List;
import java.util.Set;

public class StudentsMethods {

    public static void removeStudent (List<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3.0);
    }
    public static void promoteStudentToNextCourse(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }

    }
    public static void printStudents (Set<Student> students, int course) {
        if (students == null || students.isEmpty()) {
            System.out.println("Список стундентов пуст или равен null");
            return;
        }
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("Студенты на курсе № " + course + ": " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет студентов на этом курсе");
        }
    }
}
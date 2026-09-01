package org.example;
import java.util.*;
import static org.example.StudentsMethods.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        List<Integer> gradesOfFirstStudent = new ArrayList<>();
        gradesOfFirstStudent.add(3);
        gradesOfFirstStudent.add(4);
        gradesOfFirstStudent.add(5);
        gradesOfFirstStudent.add(3);
        gradesOfFirstStudent.add(4);

        List<Integer> gradesOfSecondStudent = new ArrayList<>();
        gradesOfSecondStudent.add(2);
        gradesOfSecondStudent.add(3);
        gradesOfSecondStudent.add(2);
        gradesOfSecondStudent.add(4);
        gradesOfSecondStudent.add(3);

        List<Integer> gradesOfThirdStudent = new ArrayList<>();
        gradesOfThirdStudent.add(3);
        gradesOfThirdStudent.add(3);
        gradesOfThirdStudent.add(2);
        gradesOfThirdStudent.add(4);
        gradesOfThirdStudent.add(3);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", 10, 1, gradesOfFirstStudent));
        students.add(new Student("Михаил", 28,2, gradesOfSecondStudent));
        students.add(new Student("Всеволод", 28, 2, gradesOfThirdStudent));

        for (Student student: students) {//вывод средних баллов
            System.out.println("Имя студента: " + student.getName() + ", средняя оценка студента: " + student.getAverageGrade());
        }

        System.out.println(students);//вывод всей информации о студентах
        Set<Student> studentSet = new HashSet<>(students);
        printStudents(studentSet, 2);//вывод студентов на конкретном курсе
        removeStudent(students);//удаление стундентов
        System.out.println(students);//печать списка студентов после удаления
        promoteStudentToNextCourse(students);//переводим студентов на след. курс, которые соот. условиям
        System.out.println(students);//повторная печать, чтобы проверить перевод студентов на след. курс

        //Задание 2
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        //добавление номеров
        telephoneDirectory.add("Кузнецов", "8-927-369-90-36");
        telephoneDirectory.add("Петров", "+7-937-639-80-40");
        telephoneDirectory.add("Кузнецов", "8-927-732-00-54");
        telephoneDirectory.add("Кузнецов", "8-917-563-36-00");
        telephoneDirectory.add("Нырялов", "8-999-999-99-99");
        System.out.println(telephoneDirectory.get("Кузнецов"));//печать номеров по фамилии
        System.out.println(telephoneDirectory.get("Куренков"));//выводит пустой список, если фамилии нет в спарвочнике
    }
}
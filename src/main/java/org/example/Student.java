package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;//Имя
    private int group;//группа
    private int course;//курс
    private List<Integer> grades;//оценки

    public Student (String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName () {
        return name;
    }
    public int getGroup () {
        return group;
    }
    public int getCourse () {
        return course;
    }
    public List<Integer> getGrades () {
        return grades;
    }
    public void setCourse (int course) {
        this.course = course;
    }

    @Override
    public String toString () {
        return ("Имя: " + getName() + ", номер группы: " + getGroup() + ", номер курса: " + getCourse() + ", оценки: " + getGrades() + ". Средняя оценка: " + getAverageGrade());
    }

    public double getAverageGrade () {//Получение средней оценки
        if (grades == null || grades.isEmpty())
            return 0.0;
        int sum =0;
        for (int g : grades) {
            sum +=g;
        } return (double) sum/grades.size();
    }
}
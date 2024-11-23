package com.teachmeskills.lesson_15.task_4.school.repository;

import com.teachmeskills.lesson_15.task_4.school.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Илья"));
        students.add(new Student("Екатерина"));
        students.add(new Student("Марина"));
        students.add(new Student("Султан"));
        students.add(new Student("Дмитрий Х."));
        students.add(new Student("Игорь"));
        students.add(new Student("Даниил"));
        students.add(new Student("Дмитрий В."));
        students.add(new Student("Олег"));
        students.add(new Student("Влад"));
        students.add(new Student("Рита"));
        students.add(new Student("Кирилл Р."));
        students.add(new Student("Сергей"));
        students.add(new Student("Богдан"));
        students.add(new Student("Кирилл М."));
        return students;
    }
}
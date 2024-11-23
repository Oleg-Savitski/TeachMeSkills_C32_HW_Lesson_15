package com.teachmeskills.lesson_15.task_4.school;

import com.teachmeskills.lesson_15.task_4.school.entities.Student;
import com.teachmeskills.lesson_15.task_4.school.entities.Teacher;

import java.util.HashSet;
import java.util.Set;

public class Classroom {

        private Set<Student> students;
        private Teacher teacher;

        public Classroom(Teacher teacher) {
            this.students = new HashSet<>();
            this.teacher = teacher;
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void displayClassInfo() {
            System.out.println("Teacher: " + teacher.getName());
            System.out.println("---------------");
            System.out.println("Students: ");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
}
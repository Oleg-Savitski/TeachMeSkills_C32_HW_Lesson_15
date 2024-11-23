package com.teachmeskills.lesson_15.task_4.app;

import com.teachmeskills.lesson_15.task_4.school.Classroom;
import com.teachmeskills.lesson_15.task_4.school.entities.Student;
import com.teachmeskills.lesson_15.task_4.school.entities.Teacher;
import com.teachmeskills.lesson_15.task_4.school.repository.StudentRepository;
import com.teachmeskills.lesson_15.task_4.school.repository.TeacherRepository;

/** Create a collection of unique names
 * of all students in our group + teacher.
 * Display the collection on the screen.
 */

public class ApplicationRunner {

    public static void main(String[] args) {

        Teacher teacher = TeacherRepository.getTeacher();

        Classroom classroom = new Classroom(teacher);

        for (Student student : StudentRepository.getStudents()) {
            classroom.addStudent(student);
        }

        classroom.displayClassInfo();
    }
}
package com.teachmeskills.lesson_15.task_4.school.repository;

import com.teachmeskills.lesson_15.task_4.school.entities.Teacher;

public class TeacherRepository {

    public static Teacher getTeacher() {
        return new Teacher("Андрей");
    }
}
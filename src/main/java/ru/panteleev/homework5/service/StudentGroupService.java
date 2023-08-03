package ru.panteleev.homework5.service;

import ru.panteleev.homework5.model.Student;
import ru.panteleev.homework5.model.StudentGroup;
import ru.panteleev.homework5.model.Teacher;

import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;
    public void create(Teacher teacher, List<Student> listStudents){
        studentGroup = new StudentGroup(teacher, listStudents);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}

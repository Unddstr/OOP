package ru.panteleev.homework4.service;

import ru.panteleev.homework4.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements Service{
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getAll(){
        return this.teachers;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: this.teachers){
            if(teacher != null){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
                }
            }
        }
        countMaxId++;

        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teacher.setTeacherId(countMaxId);
        this.teachers.add(teacher);
    }
}

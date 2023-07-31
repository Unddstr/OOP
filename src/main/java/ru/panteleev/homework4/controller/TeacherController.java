package ru.panteleev.homework4.controller;

import ru.panteleev.homework4.data.Teacher;
import ru.panteleev.homework4.service.TeacherService;
import ru.panteleev.homework4.view.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController {

    TeacherView teacherView;
    TeacherService teacherService;
    public TeacherController(TeacherView teacherView, TeacherService teacherService){
        this.teacherView = teacherView;
        this.teacherService = teacherService;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void sendOnConsole(List<Teacher> listTeacher){
        teacherView.sendOnConsole(listTeacher);
    }

    public void redactor(Teacher teacher, String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        teacher.setFirstName(firstName);
        teacher.setSecondName(secondName);
        teacher.setPatronymic(patronymic);
        teacher.setDateOfBirth(dateOfBirth);
    }

}

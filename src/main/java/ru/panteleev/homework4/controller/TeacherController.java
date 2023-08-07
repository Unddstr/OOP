package ru.panteleev.homework4.controller;

import ru.panteleev.homework4.data.Teacher;
import ru.panteleev.homework4.service.Service;
import ru.panteleev.homework4.view.View;

import java.time.LocalDate;
import java.util.List;

// Здесь мы реализовали 5 принцип, теперь наш класс зависит от абстракций View и Service, а не от их реализаций.
public class TeacherController {

    View View;
    Service Service;
    public TeacherController(View View, Service Service){
        this.View = View;
        this.Service = Service;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Service.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void sendOnConsole(List<Teacher> listTeacher){
        View.sendOnConsole(listTeacher);
    }

    public void redactor(Teacher teacher, String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        teacher.setFirstName(firstName);
        teacher.setSecondName(secondName);
        teacher.setPatronymic(patronymic);
        teacher.setDateOfBirth(dateOfBirth);
    }

}

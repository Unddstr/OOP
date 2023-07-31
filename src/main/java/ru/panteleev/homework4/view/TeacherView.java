package ru.panteleev.homework4.view;

import ru.panteleev.homework4.data.Teacher;

import java.util.List;
public class TeacherView {
    public void sendOnConsole(List<Teacher> listTeacher){
        System.out.println("Список учителей");
        for(Teacher teacher: listTeacher){
            System.out.println(teacher.getTeacherId());
        }
    }
}

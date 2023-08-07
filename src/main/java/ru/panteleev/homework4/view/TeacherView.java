package ru.panteleev.homework4.view;

import ru.panteleev.homework4.data.Teacher;

// в этом классе реализован 1 принцип. Этот класс простой, понятный и реализует поставленную задачу
import java.util.List;
public class TeacherView  implements View{
    public void sendOnConsole(List<Teacher> listTeacher){
        System.out.println("Список учителей");
        for(Teacher teacher: listTeacher){
            System.out.println(teacher.getTeacherId());
        }
    }
}

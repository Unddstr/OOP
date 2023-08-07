package ru.panteleev.homework4.view;

import ru.panteleev.homework4.data.Teacher;

import java.util.List;

// Здесь мы реализовали 4 принцип, создали простой и понятный интерфейс
public interface View {
    public void sendOnConsole(List<Teacher> listTeacher);
}

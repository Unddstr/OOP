package ru.panteleev.homework4.service;

import ru.panteleev.homework4.data.Teacher;

import java.time.LocalDate;

import java.util.List;

// Здесь мы реализовали 4 принцип, создали простой и понятный интерфейс
public interface Service {
    public List<Teacher> getAll();
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}

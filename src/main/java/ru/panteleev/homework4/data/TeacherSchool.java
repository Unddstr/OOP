package ru.panteleev.homework4.data;

import java.time.LocalDate;
// В этом классе мы реализовали 2 принцип, расширили класс Teacher, при этом не изменяли класс Teacher
public class TeacherSchool extends Teacher{
    int numberOfSchool;
    public TeacherSchool(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId, int numberOfSchool) {
        super(firstName, secondName, patronymic, dateOfBirth, teacherId);
        this.numberOfSchool = numberOfSchool;
    }
// В этом методе мы реализовали 3 принцип, мы изменили наследуемый метод, при этом не изменили принцип работы этого метода.
// Теперь если мы видим ID учителя с двумя нулями на конце, то можем сразу понять что это школьный учитель
    @Override
    public void setTeacherId(Long teacherId) {
        super.setTeacherId(teacherId * 100);
    }
}

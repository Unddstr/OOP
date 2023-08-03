package ru.panteleev.homework5.model;

public class Student extends User{

    private int studentID;

    public Student(String lastName, String firstName, String secondName, int studentID) {
        super(lastName, firstName, secondName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                '}';
    }
}

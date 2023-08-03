package ru.panteleev.homework5.Controller;

import ru.panteleev.homework5.model.Student;
import ru.panteleev.homework5.model.Type;
import ru.panteleev.homework5.service.DataService;
import ru.panteleev.homework5.view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView studentView = new StudentView();

    public void createStudent(String lastName, String firstName, String secondName){
        dataService.create(lastName, firstName, secondName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<Student> studentList = dataService.getStudentAll();
        for(Student student : studentList){
            studentView.printConsole(student);
        }
    }
}

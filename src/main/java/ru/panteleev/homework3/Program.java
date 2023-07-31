package ru.panteleev.homework3;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student student1 = new Student();
        List<Student> sl1 = new ArrayList<>();
        sl1.add(student1);
        StudentGroup sg1 = new StudentGroup();
        sg1.setStudentsList(sl1);

        Student student2 = new Student();
        Student student22 = new Student();
        List<Student> sl2 = new ArrayList<>();
        sl2.add(student2);
        sl2.add(student22);
        StudentGroup sg2 = new StudentGroup();
        sg2.setStudentsList(sl2);

        Student student3 = new Student();
        Student student33 = new Student();
        Student student333 = new Student();
        List<Student> sl3 = new ArrayList<>();
        sl3.add(student3);
        sl3.add(student33);
        sl3.add(student333);
        StudentGroup sg3 = new StudentGroup();
        sg3.setStudentsList(sl3);

        Stream s1 = new Stream();
        List<StudentGroup> StudentGroupList1 = new ArrayList<>();
        StudentGroupList1.add(sg1);
        s1.setStudentsGroupList(StudentGroupList1);

        Stream s2 = new Stream();
        List<StudentGroup> StudentGroupList2 = new ArrayList<>();
        StudentGroupList2.add(sg1);
        StudentGroupList2.add(sg2);
        s2.setStudentsGroupList(StudentGroupList2);

        Stream s3 = new Stream();
        List<StudentGroup> StudentGroupList3 = new ArrayList<>();
        StudentGroupList3.add(sg1);
        StudentGroupList3.add(sg2);
        StudentGroupList3.add(sg3);
        s3.setStudentsGroupList(StudentGroupList3);

        List<Stream> streamList = new ArrayList<>();
        streamList.add(s3);
        streamList.add(s1);
        streamList.add(s2);

        StreamService sc = new StreamService(streamList);

        Controller con = new Controller(sc);

        System.out.println(streamList.get(0).getStudentsGroupList().size());
        System.out.println(streamList.get(1).getStudentsGroupList().size());
        System.out.println(streamList.get(2).getStudentsGroupList().size());

        con.getSortedStreamList();

        System.out.println(streamList.get(0).getStudentsGroupList().size());
        System.out.println(streamList.get(1).getStudentsGroupList().size());
        System.out.println(streamList.get(2).getStudentsGroupList().size());
    }
}

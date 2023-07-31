package ru.panteleev.homework3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream> {
    private List<StudentGroup> studentsGroupList;

    public List<StudentGroup> getStudentsGroupList() {
        return studentsGroupList;
    }

    public void setStudentsGroupList(List<StudentGroup> studentsGroupList) {
        this.studentsGroupList = studentsGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Stream o) {
        Integer a = this.studentsGroupList.size();
        Integer b = o.studentsGroupList.size();
        return a.compareTo(b);
    }
}

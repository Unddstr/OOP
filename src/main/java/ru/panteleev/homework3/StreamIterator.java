package ru.panteleev.homework3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int counter;
    private final List<StudentGroup> studentGroupList;

    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.getStudentsGroupList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return studentGroupList.get(counter);
    }

    @Override
    public void remove() {
        studentGroupList.remove(counter);
    }
}

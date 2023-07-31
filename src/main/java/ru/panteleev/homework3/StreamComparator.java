package ru.panteleev.homework3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        Integer a = o1.getStudentsGroupList().size();
        Integer b = o2.getStudentsGroupList().size();
        return a.compareTo(b);
    }
}

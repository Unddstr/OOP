package ru.panteleev.homework3;

import java.util.List;

public class StreamService {
    private final List<Stream> streamList;
    public StreamService(List<Stream> streamList){
        this.streamList = streamList;
    }
    public List<Stream> getSortedStreamList(){
        streamList.sort(new StreamComparator());
        return streamList;
    }
}

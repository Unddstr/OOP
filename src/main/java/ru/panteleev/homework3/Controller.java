package ru.panteleev.homework3;

import java.util.List;

public class Controller {
    private final StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public List<Stream> getSortedStreamList(){
        return streamService.getSortedStreamList();
    }
}

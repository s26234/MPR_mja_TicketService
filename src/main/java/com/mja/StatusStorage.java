package com.mja;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class StatusStorage {

    private List<Status> statusList = new ArrayList<>();

    public LIst<Status> getStatusList() {
        return StatusList;
    }

    public StatusStorage() {
        statusList.add(new Status(new User("Adam"), new Ticket(1, "What will be the weather??", "It will be ok"));
    }

}

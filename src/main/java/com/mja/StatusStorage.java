package com.mja;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class StatusStorage {
    private List<Status> statusList = new ArrayList<>();

    public List<Status> getStatusList() {
        return statusList;
    }
    public StatusStorage() {
        statusList.add(new Status(new User("Adam"), new Ticket("Where we are?")));
        statusList.add(new Status(new User("Rafal"),new Ticket("Can I buy 2 tickets?")));
    }

}

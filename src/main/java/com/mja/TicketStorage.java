package com.mja;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class TicketStorage {

    private Ticket direction1 = new Ticket();
    private Ticket theater = new Ticket();
    private List<Ticket> ticketList = new ArrayList<>();

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public TicketStorage() {
        ticketList.add(direction1);
        ticketList.add(theater);
    }
}

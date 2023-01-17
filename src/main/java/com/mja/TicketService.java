package com.mja;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Component
public class TicketService {
    private final TicketStorage ticketStorage;
    private final StatusStorage statusStorage;

    public TicketService(TicketStorage ticketStorage, StatusStorage statusStorage) {
        this.ticketStorage = ticketStorage;
        this.statusStorage = statusStorage;
    }

    public List<Ticket> getAllTickets(){
        return TicketStorage.getTicketList();
    }

    public List<Status> getAllStatus() {
        return statusStorage.getStatusList();
    }
    public void newStatus (int id, Status status) {
        List<Ticket> ticketList = ticketStorage.getTicketList();

    }
}

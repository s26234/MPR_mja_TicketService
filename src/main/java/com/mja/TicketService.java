package com.mja;

import org.springframework.stereotype.Component;

@Component
public class TicketService {
    private final TicketStorage ticketStorage;

    public TicketService(TicketStorage ticketStorage) {
        this.ticketStorage = ticketStorage;
    }
}

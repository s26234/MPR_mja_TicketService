package com.mja;

import org.springframework.stereotype.Component;

@Component
public class TicketStorage {

    private Ticket weater = new Ticket("1","What will be the weather?", "It will be ok");
    private Ticket theater = new Ticket("2", "Buy ticket to theter", "It will cost 50 zlotych" );

}

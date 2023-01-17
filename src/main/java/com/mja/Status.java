package com.mja;

public class Status {

    private User user;
    private Ticket ticket;

    public Status (User user, Ticket ticket) {
        this.user = user;
        this.ticket = ticket;
    }

    public User getUser() {
        return user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        return "Status{" +
                "user=" + user +
                ", ticket=" + ticket +
                '}';
    }
}

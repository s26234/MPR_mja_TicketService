package com.mja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class TicketServiceApplication {
	private final TicketService ticketService;

	public TicketServiceApplication (TicketService ticketService) {
		this.ticketService = ticketService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TicketServiceApplication.class, args);
	}

}

package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Ticket;

public interface TicketService {
Ticket addTicket(Ticket p);
	
	List<Ticket> getAllTicket();
	
	Ticket findbyId(int pid);
	
	
	
	String DeleteTicket(int id);
	
}

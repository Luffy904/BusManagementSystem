package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}

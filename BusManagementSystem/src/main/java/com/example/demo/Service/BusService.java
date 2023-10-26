package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Bus;

public interface BusService {

	Bus addBus(Bus b);
	
	List<Bus> getAllBus();
	
	Bus findbyId(int bid);
	
	Bus updateBusbyId(int id,Bus b);
	
	String deleteBusbyIdd(int id);
}

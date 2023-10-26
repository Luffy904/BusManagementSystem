package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Passenger;
import com.example.demo.Repository.BusRepository;
import com.example.demo.Repository.PassengerRepository;
import com.example.demo.Service.PassengerService;

@Service
public class PassengerImpl implements PassengerService{

	
	@Autowired
	BusRepository busRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Override
	public Passenger addPassenger(Passenger p) {
		// TODO Auto-generated method stub
		Passenger p1=passengerRepository.save(p);
				p1.setBus(busRepository.findById(p.getBusid()).get());
		return passengerRepository.save(p1);
	}

	@Override
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return passengerRepository.findAll();
	}

	@Override
	public Passenger findbyId(int pid) {
		// TODO Auto-generated method stub
		return passengerRepository.findById(pid).get();
	}

	@Override
	public Passenger updatePassenger(int id, Passenger p) {
		// TODO Auto-generated method stub
		Passenger p1=passengerRepository.findById(id).get();
		p1.setPname(p.getPname());
		p1.setAge(p.getAge());
		p1.setBus(busRepository.findById(p.getBusid()).get());
		return passengerRepository.save(p1);
	}

	@Override
	public String DeletePassenger(int id) {
		// TODO Auto-generated method stub
		passengerRepository.deleteById(id);
		return "Passenger Deleted successfully.";
	}

}

package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class VehicleService {

	String name;
	public VehicleService(String name) {
		this.name = name;
	}
	
	
	Vehicle vehicle;
	@Autowired
	@Qualifier("four-wheeler")
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

	public void show_details() {
		System.out.println("Printing Details of  " + this.name);
		vehicle.start();
		vehicle.stop();
	}
}

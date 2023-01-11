package com.xworkz.firstTime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("carName")
	private String name;
	@Autowired
	@Qualifier("carBrand")
	private String brand;
	@Autowired
	@Qualifier("carPrice")
	private double price;
	@Autowired
	@Qualifier("carNoOfWheels")
	private int noOfWheels;
	@Autowired
	@Qualifier("carOwnerName")
	private String ownerName;
	@Autowired
	@Qualifier("carHavingEngine")
	private boolean havingEngine;
	@Autowired
	@Qualifier("carFuelCapacity")
	private int fuelCapicity;
	@Autowired
	@Qualifier("carMilage")
	private double milage;
	@Autowired
	@Qualifier("carSeatCapacity")
	private int seatCapacity;

	public Car() {
		System.out.println("=================Creating car by no arg constractor==================");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", brand=" + brand + ", price=" + price + ", noOfWheels=" + noOfWheels
				+ ", ownerName=" + ownerName + ", havingEngine=" + havingEngine + ", fuelCapicity=" + fuelCapicity
				+ ", milage=" + milage + ", seatCapacity=" + seatCapacity + "]";
	}

}

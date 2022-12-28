package com.xworkz.collection.dto;

import java.io.Serializable;

public class Airport implements Serializable{
	
	private String name;
	private String type;
	private int noOfFlights;
	
	
	public boolean equals(Object obj) {
		System.out.println("Running equals methods");
		if(obj!=null) {
			if(obj instanceof Airport) {
				Airport dto=(Airport)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching " + dto.name);
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	public Airport() {
		
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", type=" + type + ", noOfFlights=" + noOfFlights + ", toString()="
				+ super.toString() + "]";
	}

	public Airport(String name, String type, int noOfFlights) {
		super();
		this.name = name;
		this.type = type;
		this.noOfFlights = noOfFlights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfFlights() {
		return noOfFlights;
	}

	public void setNoOfFlights(int noOfFlights) {
		this.noOfFlights = noOfFlights;
	}

}

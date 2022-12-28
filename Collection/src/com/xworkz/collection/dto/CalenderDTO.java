package com.xworkz.collection.dto;

import java.io.Serializable;

public class CalenderDTO implements Serializable{
	
	private String name;
	private String type;
	private int noOfMonths;
	
	public boolean equals(Object obj) {
		System.out.println("Running equals methods");
		if(obj!=null) {
			if(obj instanceof CalenderDTO) {
				CalenderDTO dto=(CalenderDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("namee is matching " + dto.name);
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	public CalenderDTO() {
		
	}

	@Override
	public String toString() {
		return "CalenderDTO [name=" + name + ", type=" + type + ", population=" + noOfMonths + ", toString()="
				+ super.toString() + "]";
	}

	public CalenderDTO(String name, String type, double population) {
		super();
		this.name = name;
		this.type = type;
		this.noOfMonths = noOfMonths;
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

	public int noOfMonths() {
		return noOfMonths;
	}

	public void setnoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	
	

}

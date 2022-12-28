package com.xworkz.collection.dto;

import java.io.Serializable;

public class HolidayDTO implements Serializable{
	
	private String type;
	private int noOfHoliday;
	private boolean govtHoliday;
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals methods");
		if(obj!=null) {
			if(obj instanceof HolidayDTO) {
				HolidayDTO dto=(HolidayDTO)obj;
				if(dto.type.equals(this.type)) {
					System.out.println("type is matching " + dto.type);
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	public HolidayDTO() {
		
	}

	@Override
	public String toString() {
		return "HolidayDTO [type=" + type + ", noOfHolidayInYear=" + noOfHoliday + ", govtHoliday=" + govtHoliday
				+ "]";
	}

	public HolidayDTO(String type, int noOfHoliday, boolean govtHoliday) {
		super();
		this.type = type;
		this.noOfHoliday = noOfHoliday;
		this.govtHoliday = govtHoliday;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfHoliday() {
		return noOfHoliday;
	}

	public void setNoOfHolidayInYear(int noOfHoliday) {
		this.noOfHoliday = noOfHoliday;
	}

	public boolean isGovtHoliday() {
		return govtHoliday;
	}

	public void setGovtHoliday(boolean govtHoliday) {
		this.govtHoliday = govtHoliday;
	}
	
	

}

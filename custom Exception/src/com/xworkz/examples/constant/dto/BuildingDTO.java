package com.xworkz.examples.constant.dto;

import java.time.LocalDateTime;

import com.xworkz.examples.constant.Type;

public class BuildingDTO extends AbstractAuditDTO {

	private int no;
	private String name;
	private int floors;
	private boolean lift;
	private boolean parking;
	private Type type;
	
	public BuildingDTO() {
		System.out.println();
	}

	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", floors=" + floors + ", lift=" + lift + ", parking="
				+ parking + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public BuildingDTO(int no, String name, int floors, boolean lift, boolean parking, Type type, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}

package com.xworkz.constant.equals;

public class Institution {
	
	String HR;
	String name;
	String location;
	int NoOfstudents;
	String batchName;
	boolean triners;
	String email;
	int noOfStaff;
	String trinerName;
	boolean takenPermissionFromGovt;
	
	
	public Institution(String hR, String name, String location, int noOfstudents, String batchName, boolean triners,
			String email, int noOfStaff, String trinerName, boolean takenPermissionFromGovt) {
		super();
		HR = hR;
		this.name = name;
		this.location = location;
		NoOfstudents = noOfstudents;
		this.batchName = batchName;
		this.triners = triners;
		this.email = email;
		this.noOfStaff = noOfStaff;
		this.trinerName = trinerName;
		this.takenPermissionFromGovt = takenPermissionFromGovt;
	}
	public String getHR() {
		return HR;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getNoOfstudents() {
		return NoOfstudents;
	}
	public String getBatchName() {
		return batchName;
	}
	public boolean isTriners() {
		return triners;
	}
	public String getEmail() {
		return email;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public String getTrinerName() {
		return trinerName;
	}
	public boolean isTakenPermissionFromGovt() {
		return takenPermissionFromGovt;
	}
	public void setHR(String hR) {
		HR = hR;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setNoOfstudents(int noOfstudents) {
		NoOfstudents = noOfstudents;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public void setTriners(boolean triners) {
		this.triners = triners;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public void setTrinerName(String trinerName) {
		this.trinerName = trinerName;
	}
	public void setTakenPermissionFromGovt(boolean takenPermissionFromGovt) {
		this.takenPermissionFromGovt = takenPermissionFromGovt;
	}
	
	
	

}

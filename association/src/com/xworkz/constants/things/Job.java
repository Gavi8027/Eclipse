package com.xworkz.constants.things;

public class Job {

	
	public double salary;
	public String role;
	public double bond;
	
	
	public Job(double salary, String role, double bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	
	public void showOff() {
	System.out.println(this.salary);
	System.out.println(this.role);
	System.out.println(this.bond);
}
}
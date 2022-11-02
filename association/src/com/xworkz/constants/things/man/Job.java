package com.xworkz.constants.things.man;

public class Job {
	
	public double salary;
	public String role;
	public int bond;
	public Company company;
	public Job(double salary, String role, int bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	
	}
	
	
	public void display() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		
		
	
	this.company.display();
	}


	public void setCompany(Company company2) {
		// TODO Auto-generated method stub
		
	}
}

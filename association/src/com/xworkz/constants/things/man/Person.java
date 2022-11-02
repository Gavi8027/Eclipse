package com.xworkz.constants.things.man;

public class Person {
	
	public String name;
	public Email[] email;
	public Job job;
	public Company company;
	
	public Person(String name) {
		super();
		this.name = name;
		
	}
	public void setEmail(Email[] email) {
		this.email=email;
		}
	
	public void setJob(Job job) {
	this.job=job;
    }
    public void setCompany(Company company) {
    this.company=company;
    }
    
	public void display() {
	System.out.println(this.name);
	System.out.println(this.email);
	System.out.println(this.job);
	
	this.job.display();
	}
	

}

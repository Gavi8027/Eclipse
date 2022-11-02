package com.xworkz.constants.things;

import com.xworkz.constants.things.Job;

public class Person {
	
	public String name;
	public String email;
	public Job job;
	
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public void showOff() {
		
		System.out.println(this.name);
		System.out.println(this.email);
		Job job=new Job(20000,"developer",2);
		job.showOff();
		
	}
}

package com.xworkz.constant.Relation;

public class Satellite {
	
	public String location;
	public int indiaLaunched;
	public Satellite(String location, int indiaLaunched) {
		super();
		this.location = location;
		this.indiaLaunched = indiaLaunched;
	}
	
	public void display() {
		System.out.println(this.location);
		System.out.println(this.indiaLaunched);
	}

}

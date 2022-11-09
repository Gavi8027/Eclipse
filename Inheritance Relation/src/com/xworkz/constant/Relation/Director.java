package com.xworkz.constant.Relation;

public class Director {
	
	public String type;
	public int experience;
	public Director(String type, int experience) {
		super();
		this.type = type;
		this.experience = experience;
	}
	
	public void display() {
		System.out.println(this.type);
		System.out.println(this.experience);
	}

}

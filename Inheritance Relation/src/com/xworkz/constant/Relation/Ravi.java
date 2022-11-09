package com.xworkz.constant.Relation;

public class Ravi extends Criminal{
	
	public String gender;

	public Ravi(String name, String offence,String gender) {
		super(name, offence);
		this.gender=gender;
	}
	
	public void display() {
		super.display();
		System.out.println(this.gender);
	}

}

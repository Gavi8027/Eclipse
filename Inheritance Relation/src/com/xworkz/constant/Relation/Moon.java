package com.xworkz.constant.Relation;


public class Moon extends Satellite{
	
	public boolean usedForNavigation;

	public Moon(String location, int indiaLaunched,boolean usedForNavigation) {
		super(location, indiaLaunched);
		this.indiaLaunched=indiaLaunched;
	}
	
	public void display() {
		super.display();
		System.out.println(this.usedForNavigation);
	}

}

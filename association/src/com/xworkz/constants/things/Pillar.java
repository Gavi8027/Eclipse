package com.xworkz.constants.things;

import com.xworkz.constants.Shape;

import  com.xworkz.constants.things.Company;


public class Pillar {

	
	public int id;
	public String place;
	public Shape shape;
	public double height;
	public boolean supporting;
	public Company company;
	
	
	
	
	
	

	public Pillar(int id, String place, double height, boolean supporting) {
		super();
		this.id = id;
		this.place = place;
		this.height = height;
		this.supporting = supporting;
	
		
		
	}
	  public void showOff() {
	System.out.println(this.id);
	System.out.println(this.place);
	System.out.println(this.supporting);
	System.out.println(Shape.spherical);
	System.out.println(this.height);
	Company company = new Company("Tata","Construction");
	company.showOff();
	  }	
}

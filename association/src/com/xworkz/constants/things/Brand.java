package com.xworkz.constants.things;

import com.xworkz.constants.Location;

public class Brand {
	
	public String name;
	public int gstNo;
	public Location location=Location.bengalore;
	public double rating;
	
	public Brand(String name,int gstNo,double rating) {
	this.name=name;
	this.gstNo=gstNo;
	this.rating=rating;

}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.gstNo);
		System.out.println(this.location);
		System.out.println(this.rating);
	}

}

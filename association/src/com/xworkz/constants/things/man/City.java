package com.xworkz.constants.things.man;

public class City {
	
	
	public String name;
	public int pincode;
	public String taluk;
	public int noOfTaluk;
	public City(String name, int pincode, String taluk, int noOfTaluk) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.taluk = taluk;
		this.noOfTaluk = noOfTaluk;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.pincode);
		System.out.println(this.taluk);
		System.out.println(this.noOfTaluk);
	}

}

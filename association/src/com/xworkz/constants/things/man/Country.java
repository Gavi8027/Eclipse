package com.xworkz.constants.things.man;

public class Country {
	
	public String name;
	public String capital;
	public boolean havingFlag;
	public String presidentName;
	
	
	public Country(String name, String capital, boolean havingFlag, String presidentName) {
		super();
		this.name = name;
		this.capital = capital;
		this.havingFlag = havingFlag;
		this.presidentName = presidentName;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.havingFlag);
		System.out.println(this.presidentName);
	
	}
}

package com.xworkz.chaining.constant;

public class Marriage {
	
	public String location;
	public int date;
	public String guestName;
	
public Marriage() {
		
		System.out.println("creating marriage constractor");
}
		
	public Marriage(String location, int date, String guestName) {
		super();
		this.location = location;
		this.date = date;
		this.guestName = guestName;
	}

	
}

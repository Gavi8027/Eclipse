package com.xworkz.constants.things.man;

public class Adress {
	
	public  Location location;

	public Adress(Location  location) {
		super();
		this.location = location;
	}
	
	public void display() {
		System.out.println("Printing location details");
		this.location.display();
	}
		public void setAdress(Location location) {
			
		
	}

}

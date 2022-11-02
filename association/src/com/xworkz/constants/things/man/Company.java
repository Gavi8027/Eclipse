package com.xworkz.constants.things.man;

public class Company {
	
	public String name;
	public String ownerName;
	public Adress adress;
	
	
	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
		public void setAddress(Adress adress) {
			this.adress=adress;
		}
		
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
		
		this.adress.display();
		
	 
}
}
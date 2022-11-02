package com.xworkz.constants.things.man;

public class Location {
	
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;
	public Location(int no, String street, City city, State state, Country country) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public void setLocation(State state,Country country,City city) {
		this.state.display();
		this.city.display();
		this.country.display();
		
	}
	
	
	public void display() {
		System.out.println(this.no);
		System.out.println(this.street);
		this.city.display();
		this.state.display();
		this.country.display();
		
		
		
	}
	}


package com.xworkz.constants.things;

import com.xworkz.constants.Locations;
import com.xworkz.constants.Temple;

public class Mountain {
	
	public String name;
	public Locations locations=Locations.KOPPAL;
	public int height;
	public Temple temple=Temple.ANJANEYA;
	public Stala stala;
	
	public Mountain(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	
	}
	
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.locations);
		System.out.println(this.height);
		System.out.println(this.temple);
		System.out.println(this.stala);
		

			Stala stala=new Stala("Aaneguddi","gangavati","Karnataka",583231,"India");
			stala.showOff();
	}	

}

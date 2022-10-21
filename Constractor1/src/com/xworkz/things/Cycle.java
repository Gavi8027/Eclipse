package com.xworkz.things;

public class Cycle {
	
	
	public String cycleName;
	public String[] color;
	public int[] price;
	public boolean ride;
	public String[] types;
	public String[] usagePersons;
	public String[] parts;
	
	public Cycle(String penName,String[] color,int[] price,boolean ride,String[] types,String[] usagePersons,String[] parts) {
		this.cycleName=cycleName;
		this.color=color;
		this.price=price;;
		this.ride=ride;
		this.types=types;
		this.usagePersons=usagePersons;
		this.parts=parts;
		
	}

	public void display() {
		System.out.println(this.cycleName);
		System.out.println(this.ride);
		
		
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < price.length; i++) {
			long string = price[i];
			System.out.println(string);
		}
		for (int i = 0; i < types.length; i++) {
			String string = types[i];
			System.out.println(string);
		}
		for (int i = 0; i < usagePersons.length; i++) {
			String string = usagePersons[i];
			System.out.println(string);
		}
		for (int i = 0; i < parts.length; i++) {
			String string = parts[i];
			System.out.println(string);
		}
		
		
		
		
	}
	



}

	



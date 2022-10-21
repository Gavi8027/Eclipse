package com.xworkz.things;

public class Pen {
	
	public String penName;
	public String[] color;
	public int[] price;
	public boolean toWrite;
	public String[] types;
	public String[] usages;
	public int[] size;
	
	public Pen(String penName,String[] color,int[] price,boolean toWrite,String[] types,String[] usages,int[] size) {
		this.penName=penName;
		this.color=color;
		this.price=price;;
		this.toWrite=toWrite;
		this.types=types;
		this.usages=usages;
		this.size=size;
		
	}

	
	public void display() {
		System.out.println(this.penName);
		System.out.println(this.toWrite);
		
		
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
		for (int i = 0; i < usages.length; i++) {
			String string = usages[i];
			System.out.println(string);
		}
		for (int i = 0; i < size.length; i++) {
			int string = size[i];
			System.out.println(string);
		}
		
		
		
		
	}
	



}

	


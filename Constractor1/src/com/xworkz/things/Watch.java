package com.xworkz.things;

public class Watch {
	
	public String watchName;
	public String[] color;
	public int[] price;
	public boolean toSeeTime;
	public String[] types;
	public String[] shapes;
	public int[] number;
	
	public Watch(String watchNames,String[] color,int[] price,boolean toSeeTime,String[] types,String[] shapes,int[] number) {
		this.watchName=watchName;
		this.color=color;
		this.price=price;;
		this.toSeeTime=toSeeTime;
		this.types=types;
		this.shapes=shapes;
		this.number=number;

	}
	
	public void display() {
		System.out.println(this.watchName);
		System.out.println(this.toSeeTime);
		
		
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
		for (int i = 0; i < shapes.length; i++) {
			String string = shapes[i];
			System.out.println(string);
		}
		for (int i = 0; i < number.length; i++) {
			int string = number[i];
			System.out.println(string);
		}
		
		
		
		
	}
	



}

	
		
	
	
	



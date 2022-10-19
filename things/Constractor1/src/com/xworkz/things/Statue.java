package com.xworkz.things;

public class Statue {

	public boolean nonLiving;
	public double height;
	public String[] color;
	public String[] person;
	public int noOfStatue;
	
	
	
	public Statue(boolean nonLiving,double height,String[] color,String[] person,int noOfStatue){
	
		this.nonLiving=nonLiving;
		this.height=height;
		this.color=color;
		this.person=person;
		this.noOfStatue=noOfStatue;
		
		
	}
		public void Display() {
			System.out.println(this.nonLiving);
			System.out.println(this.height);
			System.out.println(this.noOfStatue);
		
			
			for (int i = 0; i < color.length; i++) {
				String string = color[i];
				System.out.println(string);
			}
			for (int i = 0; i < person.length; i++) {
				String string = person[i];
				System.out.println(string);
			}
			
			
			
		
}
}
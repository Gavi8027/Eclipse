package com.xworkz.things;

public class Tractor {
	
	public String ownername;
	public String brand;
	public double price;
	public String color;
	public String model;
	
	public Tractor() {
		System.out.println("creating default constractor");
	}
	
	
	public Tractor(String name) {
	this.ownername=name;
}
	public Tractor(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	
	public Tractor(double price) {
		this.price=price;
	}
	
	public Tractor(double price, String color) {
		this.price=price;
		this.color=color;
	}
     public Tractor(String color,String brand,double price) {
    	 this.color=color;
    	 this.brand=brand;
    	 this.price=price;
     }
     public Tractor(String name,String brand,String model) {
	     this.ownername=name;
	     this.brand=brand;
	     this.model=model;
     }
     public Tractor(String name,String brand,String model,String color,double price) {
    	 this.ownername=name;
    	 this.brand=brand;
    	 this.model=model;
    	 this.color=color;
    	 this.price=price;
     }
	

}

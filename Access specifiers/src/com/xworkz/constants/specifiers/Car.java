package com.xworkz.constants.specifiers;

public class Car {
	
	private String brand ="default name";
	private String color="default color";
	private double price= 0000;
	private String ambasassador= "default name";
	private boolean useFull =true;
	private double quantity= 0;
	private int weight=0;
	public boolean travel;
	public int wheel;
	public int milage;
	public String engine;
	public String companyHeadquaretrs;
	
	public String getBrand() {
	    return this.brand;
	}
	
	
	public String getColor() {
	    return this.color;
	}
	
	
	public double getPrice() {
	    return this.price;
	}
	
	public String getAmbasassador() {
      return this.ambasassador;
	}
	
	public boolean getUseFull() {
	    return this.useFull;
	}
	
	public double getQuantity() {
	    return this.quantity;
	}
	
	public int getWeight() {
	    return this.weight;
	}
	
	public boolean getTravel() { 
	    return this.travel;
	}
	 


	public int getWheel() {
	    return this.wheel;
	}
	
	public int getMilage() {
	    return this.milage;
	}
	
	public String getEngine() {
	    return this.engine;
	}
	
	public String getCmpanyHeadquaretrs() {
	    return this.companyHeadquaretrs;
	}


	public void setBrand(String brand, String color, double price, String ambasassador, boolean useFull, double quantity,
			int weight, boolean travel, int wheel, int milage, String engine, String companyHeadquaretrs) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ambasassador = ambasassador;
		this.useFull = useFull;
		this.quantity = quantity;
		this.weight = weight;
		this.travel = travel;
		this.wheel = wheel;
		this.milage = milage;
		this.engine = engine;
		this.companyHeadquaretrs = companyHeadquaretrs;
	}
	
	

}





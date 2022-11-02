package com.xworkz.constants.specifiers;

public class WashingMachine {
	
	private String brand ="default name";
	private String color="default color";
	private double price= 0000;
	private String ambasassador= "default name";
	private boolean useFull =true;
	private double quantity= 0;
	private int weight=0;
	public boolean havingWheels;
	public int rating;
	public int noOfDisplay;
	public String type;
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
	
	public boolean getHavingWheels() { 
	    return this.havingWheels;
	}
	 


	public int getRating() {
	    return this.rating;
	}
	
	public int getNoOfDisplay() {
	    return this.noOfDisplay;
	}
	
	public String getType() {
	    return this.type;
	}
	
	public String getCmpanyHeadquaretrs() {
	    return this.companyHeadquaretrs;
	}


	public void setBrand(String brand, String color, double price, String ambasassador, boolean useFull, double quantity,
			int weight, boolean havingWheels, int rating, int noOfDisplay, String type, String companyHeadquaretrs) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ambasassador = ambasassador;
		this.useFull = useFull;
		this.quantity = quantity;
		this.weight = weight;
		this.havingWheels = havingWheels;
		this.rating = rating;
		this.noOfDisplay = noOfDisplay;
		this.type = type;
		this.companyHeadquaretrs = companyHeadquaretrs;
	}
	
}

package com.xworkz.constants.specifiers;

public class Mobile {
	
	private String brand ="default name";
	private String color="default color";
	private double price= 0000;
	private String ambasassador= "default name";
	private boolean dualSim =true;
	private double quantity= 0;
	private int weight=0;
	public boolean easyToCarry;
	public int size;
	public int ram;
	public String category;
	public String battry;
	
	
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
	
	public boolean getDualSim() {
	    return this.dualSim;
	}
	
	public double getQuantity() {
	    return this.quantity;
	}
	
	public int getWeight() {
	    return this.weight;
	}
	
	public boolean getEasyToCarry() { 
	    return this.easyToCarry;
	}
	 


	public int getSize() {
	    return this.size;
	}
	
	public int getRam() {
	    return this.ram;
	}
	
	public String getCategory() {
	    return this.category;
	}
	
	public String getBattry() {
	    return this.battry;
	}


	public void setBrand(String brand, String color, double price, String ambasassador, boolean dualSim, double quantity,
			int weight, boolean easyToCarry, int size, int ram, String category, String battry) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ambasassador = ambasassador;
		this.dualSim = dualSim;
		this.quantity = quantity;
		this.weight = weight;
		this.easyToCarry = easyToCarry;
		this.size = size;
		this.ram = ram;
		this.category = category;
		this.battry = battry;
	}
	
	

}




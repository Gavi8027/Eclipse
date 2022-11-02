package com.xworkz.constants.specifiers;

public class Laptop {
	
	private String brand ="default name";
	private String color="default color";
	private double price= 0000;
	private String ambasassador= "default name";
	private boolean useFull =true;
	private double quantity= 0;
	private int weight=0;
	public boolean keyBoard;
	public int size;
	public int ram;
	public String typeOfStorage;
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
	
	public boolean getUseFull() {
	    return this.useFull;
	}
	
	public double getQuantity() {
	    return this.quantity;
	}
	
	public int getWeight() {
	    return this.weight;
	}
	
	public boolean getKeyBoard() { 
	    return this.keyBoard;
	}
	 


	public int getSize() {
	    return this.size;
	}
	
	public int getRam() {
	    return this.ram;
	}
	
	public String getTypeOfStorage() {
	    return this.typeOfStorage;
	}
	
	public String getBattry() {
	    return this.battry;
	}


	public void setBrand(String brand, String color, double price, String ambasassador, boolean useFull, double quantity,
			int weight, boolean keyBoard, int size, int ram, String typeOfStorage, String battry) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ambasassador = ambasassador;
		this.useFull = useFull;
		this.quantity = quantity;
		this.weight = weight;
		this.keyBoard = keyBoard;
		this.size = size;
		this.ram = ram;
		this.typeOfStorage = typeOfStorage;
		this.battry = battry;
	}
	
	

}

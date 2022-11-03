package com.xworkz.constants.specifiers;

public class Bulb {
	
	private String name="default name";
	private String color="default color";
	private int price=0;
	private String shape="default shape";
	private int weight=0;
	private String company="default";
	public boolean illumination;
	public boolean madeByGlass;
	public boolean havingTungsten;
	public boolean havingThread;
	public String ambassador;
	
	public String getName() {
	    return this.name;
	}
	
	
	public String getColor() {
	    return this.color;
	}
	
	
	public double getPrice() {
	    return this.price;
	}
	
	public String getShape() {
	return this.shape;
     }
	
	public int getWeight() {
	return this.weight;	
	}
	
	 


	public String getCompany() {
	    return this.company;
	}
	
	public boolean getIllumination() {
	    return this.illumination;
	}
	public boolean getMadeByGlass() {
	    return this.madeByGlass;
	}
	
	public boolean getHavingTungsten() {
	    return this.havingTungsten;
	}
	
	public boolean getHavingThread() {
	    return this.havingThread;
	}
	public String getambassador() {
	    return this.ambassador;
	}


	public void setBrand(String name, String color, int price, String shape, int weight, String company, boolean illumination,
			boolean madeByGlass, boolean havingTungsten, boolean havingThread, String ambassador) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.shape = shape;
		this.weight = weight;
		this.company = company;
		this.illumination = illumination;
		this.madeByGlass = madeByGlass;
		this.havingTungsten = havingTungsten;
		this.havingThread = havingThread;
		this.ambassador = ambassador;
	}
	


}

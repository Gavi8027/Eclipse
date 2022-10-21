package com.xworkz.things;

public class Govtbus {
	
	public String ownerName;
	public String[] color;
	public long[] price;
	public int[] mileage;
	public boolean journey;
	public String[] tyres;
	public String[] desielEngine;
	public boolean fuelTank;
	public int[] speedMeter;

	public Govtbus(String ownerName,String[] color,long[] price,int[] mileage,boolean journey,String[] tyres,String[] desielEngine,boolean fuelTank,int[] speedMeter){
		this.ownerName=ownerName;
		this.color=color;
		this.price=price;
		this.mileage=mileage;
		this.journey=journey;
		this.tyres=tyres;
		this.desielEngine=desielEngine;
		this.fuelTank=fuelTank;
		this.speedMeter=speedMeter;
	}
	public void display() {
		System.out.println(this.ownerName);
		System.out.println(this.tyres);
		System.out.println(this.fuelTank);
		
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < price.length; i++) {
			long string = price[i];
			System.out.println(string);
		}
		for (int i = 0; i < mileage.length; i++) {
			int string = mileage[i];
			System.out.println(string);
		}
		for (int i = 0; i < tyres.length; i++) {
			String string = tyres[i];
			System.out.println(string);
		}
		for (int i = 0; i < desielEngine.length; i++) {
			String string = desielEngine[i];
			System.out.println(string);
		}
		for (int i = 0; i < speedMeter.length; i++) {
			int string = speedMeter[i];
			System.out.println(string);
		}
		
		
		
	}
	



}

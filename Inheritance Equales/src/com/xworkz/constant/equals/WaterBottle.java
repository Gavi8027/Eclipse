package com.xworkz.constant.equals;

public class WaterBottle {
	
	String name;
	String material;
	String color;
	int price;
	int weight;
	String capacity;
	int size;
	boolean carryWater;
	boolean havingCap;
	float diameter;
	
	
	public WaterBottle(String name, String material, String color, int price, int weight, String capacity, int size,
			boolean carryWater, boolean havingCap, float diameter) {
		super();
		this.name = name;
		this.material = material;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.capacity = capacity;
		this.size = size;
		this.carryWater = carryWater;
		this.havingCap = havingCap;
		this.diameter = diameter;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isCarryWater() {
		return carryWater;
	}
	public void setCarryWater(boolean carryWater) {
		this.carryWater = carryWater;
	}
	public boolean isHavingCap() {
		return havingCap;
	}
	public void setHavingCap(boolean havingCap) {
		this.havingCap = havingCap;
	}
	public float getDiameter() {
		return diameter;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	

}

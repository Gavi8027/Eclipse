package com.xworkz.constant.Relation;

public class ShoppingMall {
	
	public int noOfVisitors;
	public String location;
	
	
	public ShoppingMall(int noOfVisitors, String location) {
		super();
		this.noOfVisitors = noOfVisitors;
		this.location = location;
	}
	public void display() {
		System.out.println(this.location);
		System.out.println(this.noOfVisitors);
	}

}

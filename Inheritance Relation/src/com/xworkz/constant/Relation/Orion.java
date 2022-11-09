package com.xworkz.constant.Relation;

public class Orion extends  ShoppingMall{
	
	public boolean forShopping;

	public Orion(int noOfVisitors, String location,boolean forShopping) {
		super(noOfVisitors, location);
		this.forShopping=forShopping;
	}
	public void display() {
		super.display();
		System.out.println(this.forShopping);
		
	}

}
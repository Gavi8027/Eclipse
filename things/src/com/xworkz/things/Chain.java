package com.xworkz.things;

public class Chain {
	
	public String type;
	public int length;
	public String material;
	public double weight;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;
	
	public Chain() {
		System.out.println("nayi katti hakoke");
	}
	
	public Chain(String type) {
		this.type=type;
	}
	
	public Chain(String material,double weight) {
		this.material=material;
		this.weight=weight;
	}
	
	
	public Chain(double weight) {
		this.weight=weight;
	}
	
	public Chain(int length, String type) {
		this.length=length;
		this.type=type;
		}
	
	
	public Chain(boolena stolen,String type,String usedFor) {
		this.stolen=stolen;
		this.type=type;
		this.usedFor=usedFor;
	    
}
	public Chain(double weight,boolean fresh) {
		this.weight=weight;
		this.fresh=fresh;
		}
	
	public Chain(String type,int length,String material,double weight,boolean fresh) {
	this.type=type;
	this.length=length;
	this.material=material;
	this.weight=weight;
	this.fresh=fresh;
}
}
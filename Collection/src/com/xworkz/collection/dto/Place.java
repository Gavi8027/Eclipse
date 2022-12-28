package com.xworkz.collection.dto;

import java.io.Serializable;

public class Place implements Serializable{
	
	private String name;
	private String famouFor;
	private int noOfTaluk;
	
	public boolean equals(Object obj) {
		System.out.println("Running equals methods");
		if(obj!=null) {
			if(obj instanceof Place) {
				Place dto=(Place)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("namee is matching " + dto.name);
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	
	public Place() {
		
	}

	@Override
	public String toString() {
		return "Place [name=" + name + ", famouFor=" + famouFor + ", noOfTaluk=" + noOfTaluk + ", toString()="
				+ super.toString() + "]";
	}

	public Place(String name, String famouFor, int noOfTaluk) {
		super();
		this.name = name;
		this.famouFor = famouFor;
		this.noOfTaluk = noOfTaluk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamouFor() {
		return famouFor;
	}

	public void setFamouFor(String famouFor) {
		this.famouFor = famouFor;
	}

	public int getNoOfTaluk() {
		return noOfTaluk;
	}

	public void setNoOfTaluk(int noOfTaluk) {
		this.noOfTaluk = noOfTaluk;
	}

}

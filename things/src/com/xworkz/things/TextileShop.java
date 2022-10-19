package com.xworkz.things;

public class TextileShop {
	
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public float ownerDaughterNumber;
	public int ownerNoOfWifes;
	public int shopNo;
	public float ownerContact;
	
	
	
	
	public TextileShop(String ownerName,String ownerWifeName) {
    this.ownerName=ownerName;
    this.ownerWifeName=ownerWifeName;
}
	
	public TextileShop(String ownerDaughterName,float ownerDaughterNumber) {
		this.ownerDaughterName=ownerDaughterName;
		this.ownerDaughterNumber=ownerDaughterNumber;
		
	}
	public TextileShop(int ownerNoOfWifes, float ownerContact) {
		this.ownerNoOfWifes=ownerNoOfWifes;
		this.ownerContact=ownerContact;
		
	}
	public TextileShop(int shopNo, float ownerDaughterNumber,String ownerName) {
		this.shopNo=shopNo;
		this.ownerDaughterNumber=ownerDaughterNumber;
		this.ownerName=ownerName;
	    
	}
	public TextileShop(float ownerContact, String ownerDaughterName) {
		this.ownerContact=ownerContact;
		this.ownerDaughterName=ownerDaughterName;
	}
	
	public TextileShop(int shopNo,int ownerNoOfWifes) {
	this.shopNo=shopNo;
	this.ownerNoOfWifes=ownerNoOfWifes;
	}
	
	
	public TextileShop(String ownerDaughterName,float ownerContact,String ownerWifeName) {
		this.ownerDaughterName=ownerDaughterName;
		this.ownerContact=ownerContact;
		this.ownerWifeName=ownerWifeName;
	}
	
	public TextileShop(int ownerNoOfWifes, int shopNo,float ownerContact) {
		this.ownerNoOfWifes=ownerNoOfWifes;
		this.shopNo=shopNo;
		this.ownerContact=ownerContact;
	
	
	
	}	
}

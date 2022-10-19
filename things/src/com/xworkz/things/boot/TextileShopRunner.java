package com.xworkz.things.boot;

import  com.xworkz.things.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		
				
		
		System.out.println(System.lineSeparator());
		TextileShop textile1=new TextileShop("Ramesh","Ramya");
        System.out.println(textile1.ownerName);
        System.out.println(textile1.ownerWifeName);
        
        
        System.out.println(System.lineSeparator());
        TextileShop textile2 =new TextileShop("Rashmi",9916763682f);
        System.out.println(textile2.ownerDaughterName);
        System.out.println(textile2.ownerDaughterNumber);
        
        
        System.out.println(System.lineSeparator());
        TextileShop textile3 =new TextileShop(5,9916177482f);
        System.out.println(textile3.ownerNoOfWifes);
        System.out.println(textile3. ownerContact);
        
        
        System.out.println(System.lineSeparator());
        TextileShop textile4 =new TextileShop(9008841571f,"Ramesh");
        System.out.println(textile4.ownerDaughterNumber);
        System.out.println(textile4.ownerName);
        
        
        System.out.println(System.lineSeparator());
        TextileShop textile5 =new TextileShop(9916177482f,"Rashmi");
        System.out.println(textile5.ownerContact);
        System.out.println(textile5.ownerDaughterName);
        
        System.out.println(System.lineSeparator());
        TextileShop textile6 =new TextileShop(43,5);
        System.out.println(textile6.shopNo);
        System.out.println(textile6.ownerNoOfWifes);
        
        System.out.println(System.lineSeparator());
        TextileShop textile7 =new TextileShop("Rashmi",9916177482f,"Ramya");
        System.out.println(textile7.ownerDaughterName);
        System.out.println(textile7.ownerContact);
        System.out.println(textile7.ownerWifeName);
        
        
        System.out.println(System.lineSeparator());
        TextileShop textile8 =new TextileShop(5,43,9916177482f);
        System.out.println(textile8.ownerNoOfWifes);
        System.out.println(textile8.shopNo);
        System.out.println(textile8.ownerContact);
        
        
        
        
        
        
	}

}

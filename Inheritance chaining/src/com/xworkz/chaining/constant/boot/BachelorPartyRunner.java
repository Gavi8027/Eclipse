package com.xworkz.chaining.constant.boot;

import com.xworkz.chaining.constant.BachelorParty;
import com.xworkz.chaining.constant.Enjoyment;
public class BachelorPartyRunner {

	public static void main(String[] args) {
		
		BachelorParty bachelorParty=new Enjoyment("Omkar sir","Magadi",100,true);
		System.out.println(bachelorParty.location);
		System.out.println(bachelorParty.night);
		System.out.println(bachelorParty.noOfPeople);
		System.out.println(bachelorParty.SponsorName);
		
		Enjoyment bachelorParty1=new Enjoyment("Ramesh","Mandya",150,false);
		System.out.println(bachelorParty1.location);
		System.out.println(bachelorParty1.night);
		System.out.println(bachelorParty1.noOfPeople);
		System.out.println(bachelorParty1.SponsorName);
		
		
		
		
		

	}

}

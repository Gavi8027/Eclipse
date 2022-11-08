package com.xworkz.chaining.constant.boot;

import com.xworkz.chaining.constant.Marriage;
import com.xworkz.chaining.constant.Reception;

public class Marriagerunner {
	
	public static void main(String[] args) {
		
		Marriage marriage=new Reception("Bengalore",13,"akshar sir");
		System.out.println(marriage.date);
		System.out.println(marriage.guestName);
		System.out.println(marriage.location);
		
		Reception marriage2=new Reception("Magadi",12,"vinay sir");
		System.out.println(marriage2.date);
		System.out.println(marriage2.guestName);
		System.out.println(marriage2.location);
	}
	
	

}

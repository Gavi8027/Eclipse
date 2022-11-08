package com.xworkz.chaining.constant.boot;


import com.xworkz.chaining.constant.Catering;
import com.xworkz.chaining.constant.Team;
public class CateringRunner {
	
	
	public static void main (String[] args) {
	Catering catering=new Team("Annapurneshwari",20,"Belagavi");
	System.out.println(catering.nativePlace);
	System.out.println(catering.noOfSuppliesr);
	System.out.println(catering.squadName);
	
	Team catering2=new Team("Annadaneshwara",18,"Mandya");
	System.out.println(catering2.nativePlace);
	System.out.println(catering2.noOfSuppliesr);
	System.out.println(catering2.squadName);
		
	}
	
	

}

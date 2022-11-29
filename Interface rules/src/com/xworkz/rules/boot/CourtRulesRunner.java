package com.xworkz.rules.boot;

import com.xworkz.rules.Court;
import com.xworkz.rules.CourtRules;

public class CourtRulesRunner {

	public static void main(String[] args) {

		
      CourtRules courtRules =new Court();
		
		Court court=new Court();
		
			Object obj=new Object();
			
			System.out.println(court.displaneInCourt());
			System.out.println(court.evidence());
			System.out.println(court.indianCitizen());
			System.out.println(court.obeyingRules());
			System.out.println(court.writtenDocuments());
	}

}

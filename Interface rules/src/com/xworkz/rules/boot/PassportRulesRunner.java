package com.xworkz.rules.boot;

import com.xworkz.rules.Passport;
import com.xworkz.rules.PassportRules;

public class PassportRulesRunner {

	public static void main(String[] args) {

		
      PassportRules passporttRules =new Passport();
		
		Passport passport=new Passport();
		
			Object obj=new Object();
			
			System.out.println(passport.indianCitizen());
			System.out.println(passport.nonCriminalCase());
			System.out.println(passport.panCard());
			System.out.println(passport.photo());
			System.out.println(passport.aadharCard());
	}

}

package com.xworkz.rules.boot;

import com.xworkz.rules.Army;
import com.xworkz.rules.ArmyRules;

public class ArmyRulesRunner {

	public static void main(String[] args) {

	 ArmyRules armyRules =new Army();
		
		Army army=new Army();
		
			Object obj=new Object();
			
			System.out.println(army.height());
			System.out.println(army.indianCitizen());
			System.out.println(army.nonCriminalCases());
			System.out.println(army.obeyingOrders());
			System.out.println(army.uniform());
	}

}

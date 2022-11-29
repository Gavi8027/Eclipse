package com.xworkz.rules.boot;

import com.xworkz.rules.PG;
import com.xworkz.rules.PGRules;

public class PGRulesRunner {

	public static void main(String[] args) {

		PGRules pGRules =new PG();
		
		PG pG=new PG();
		
			Object obj=new Object();
			
			System.out.println(pG.inTime());
			System.out.println(pG.mentainNeat());
			System.out.println(pG.pgRent());
			System.out.println(pG.saveWater());
			System.out.println(pG.switchOffSupply());
	}

}

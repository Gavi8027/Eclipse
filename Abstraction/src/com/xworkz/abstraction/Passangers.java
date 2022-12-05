package com.xworkz.abstraction;

public class Passangers implements PassangersRules{

	@Override
	public boolean passportMandatory() {
     System.out.println("Running passportMandatory");
		return false;
	}
}	
	



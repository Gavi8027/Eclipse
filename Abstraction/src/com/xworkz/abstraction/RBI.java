package com.xworkz.abstraction;

public class RBI {
	
	private AxisBank rbi;

	public RBI() {
		System.out.println("Running default constractor");
	}


	public RBI(AxisBank rbi) {
		super();
		this.rbi = rbi;
	}

	public void checkBalence() {
		if(rbi!=null) {
			double minBalance=this.rbi.minBalance();
			if(minBalance==50000) {
				System.out.println("The bank is following RBI Rules");
			}
			else {
				System.out.println("The bank is not following RBI Rules");
			}
			
		}
	}
	
	

	

}

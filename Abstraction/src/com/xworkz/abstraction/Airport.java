package com.xworkz.abstraction;

public class Airport {
	
	private Passangers passangers;
	
	public Airport() {
		System.out.println("Running default Airport constractor");
	}

	public Airport(Passangers passangers) {
		super();
		this.passangers = passangers;
	}
	
	public void checkpassportMandatory() {
		if(passangers!=null) {
			boolean passportMandatory=this.passangers.passportMandatory();
			if(passportMandatory==false) {
				System.out.println("allow the passangera to travel");
			}
			else {
				System.out.println("the passangers are not allow to travel");
			}
		}
	}

}

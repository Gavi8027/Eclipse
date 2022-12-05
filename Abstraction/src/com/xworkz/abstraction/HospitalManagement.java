package com.xworkz.abstraction;

public class HospitalManagement {
	
	private VisitorRule visitorRule;
	
	public HospitalManagement() {
		System.out.println("Running default constractor");
	}

	public HospitalManagement(VisitorRule visitorRule) {
		super();
		this.visitorRule = visitorRule;
	}
	
	public void checknoSmoking() {
		if(visitorRule!=null) {
			boolean noSmoking=this.visitorRule.noSmoking();
			if(noSmoking==false) {
				System.out.println("Visitors are following the hospital rules");
			}
			else {
				System.out.println("Visitors are not following the hospital rules");
			}
		}
	}

}

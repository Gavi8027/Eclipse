package com.xworkz.abstraction;

public class BMRCL {
      
	private MetroStaff metroStaff;
	
	public BMRCL() {
		System.out.println("defaulr BMRCL constractor");
	}

	public BMRCL(MetroStaff metroStaff) {
		super();
		this.metroStaff = metroStaff;
	}
	public void checkinTime() {
		boolean inTime=this.metroStaff.inTime();
		if(inTime==false) {
			System.out.println("The metro staffs are following the BMRCL rules");
		}
		else {
			System.out.println("The metro staffs are not following the BMRCL rules");
		}
	}
}

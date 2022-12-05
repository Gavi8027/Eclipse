package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.BMRCL;
import com.xworkz.abstraction.MetroStaff;

public class BMRCLRunner {

	public static void main(String[] args) {

		MetroStaff metroStaff=new MetroStaff();
		BMRCL bMRCL = new BMRCL(metroStaff);
		bMRCL.checkinTime();
		
		
	}

}

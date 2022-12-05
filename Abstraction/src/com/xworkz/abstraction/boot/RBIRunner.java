package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.AxisBank;
import com.xworkz.abstraction.RBI;

public class RBIRunner {

	public static void main(String[] args) {

		
		AxisBank axisBank=new AxisBank();
		RBI rbi=new RBI(axisBank);
		rbi.checkBalence();
	}

}

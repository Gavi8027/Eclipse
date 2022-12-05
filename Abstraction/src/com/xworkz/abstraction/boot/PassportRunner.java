package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.Airport;
import com.xworkz.abstraction.Passangers;

public class PassportRunner {

	public static void main(String[] args) {

		
		Passangers passangers=new Passangers();
		Airport airport=new Airport(passangers);
		airport.checkpassportMandatory();
		
		
		
	}

}

package com.xworkz.rules.boot;

import com.xworkz.rules.Bike;
import com.xworkz.rules.BikeRules;

public class BikeRunner {

	public static void main(String[] args) {

		 BikeRules bikeRules =new Bike();
			
			Bike bike=new Bike();
		
			Object obj=new Object();
			
			System.out.println(bike.dl());
			System.out.println(bike.fuel());
			System.out.println(bike.horn());
			System.out.println(bike.insurence());
			System.out.println(bike.wheel());
	}

}

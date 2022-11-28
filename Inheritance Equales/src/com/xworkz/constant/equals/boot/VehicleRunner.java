package com.xworkz.constant.equals.boot;

import com.xworkz.constant.equals.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {

	
	Vehicle vehicle=new Vehicle("Innova", 0, null, null, 0, null, null, 0, null, 0, 0, null);
		
		
		Vehicle vehicle1=new Vehicle("Innova",11,"petrol","1998cc",4,"130.1bph@6500rpm","181Nm@4000rpm",8,"Manual",319,55,"MUV");

		
		boolean same=vehicle.equals(vehicle1);
		System.out.println(same);
	}

}
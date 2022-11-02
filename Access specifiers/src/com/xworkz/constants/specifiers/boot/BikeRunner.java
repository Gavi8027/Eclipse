package com.xworkz.constants.specifiers.boot;

import com.xworkz.constants.specifiers.Bike;
import com.xworkz.constants.specifiers.	BikeShowRoomManager;

public class BikeRunner {

	public static void main(String[] args) {
		
		BikeShowRoomManager manager = new BikeShowRoomManager();
		Bike bike=new Bike();
		
		
		manager.useBike(bike);
		System.out.println("");
		System.out.println("after modifiying: the default variables");
		manager.useBike(bike);
		
		System.out.println("");
		System.out.println("access to read");
		
		System.out.println(bike.getBrand());
		System.out.println(bike.getColor());
		System.out.println(bike.getPrice());
		System.out.println(bike.getAmbasassador());
		System.out.println(bike.getUseFull());
		System.out.println(bike.getQuantity());
		System.out.println(bike.getWeight());
		System.out.println(bike.getTravel());
		System.out.println(bike.getWheel());
		System.out.println(bike.getMilage());
		System.out.println(bike.getEngine());
		System.out.println(bike.getCmpanyHeadquaretrs());

	}

}

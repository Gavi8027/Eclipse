package com.xworkz.constants.specifiers;

public class BikeShowRoomManager {
	
	
	public String name="Duke";
	public Bike bike;
	
	public void useBike(Bike bike) {
		
		
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
		
		bike.setBrand("KTM","Black",230000,"shah rukh khan",true,1,150,true,2,30,"Petrol","Austria");
		
		

}
}
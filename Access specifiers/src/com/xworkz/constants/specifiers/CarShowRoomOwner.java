package com.xworkz.constants.specifiers;

public class CarShowRoomOwner {
	
	public String name="Duke";
	public Car car;
	
	public void useCar(Car car) {
		
		
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());
		System.out.println(car.getAmbasassador());
		System.out.println(car.getUseFull());
		System.out.println(car.getQuantity());
		System.out.println(car.getWeight());
		System.out.println(car.getTravel());
		System.out.println(car.getWheel());
		System.out.println(car.getMilage());
		System.out.println(car.getEngine());
		System.out.println(car.getCmpanyHeadquaretrs());
		
		car.setBrand("Kia","Red",750000,"Rafeel Nadal",true,1,1300,true,4,21,"Petrol","South Korea");
		
		
	}
}

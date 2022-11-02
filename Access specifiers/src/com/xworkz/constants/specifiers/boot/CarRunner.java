package com.xworkz.constants.specifiers.boot;

import com.xworkz.constants.specifiers.Car;
import com.xworkz.constants.specifiers. CarShowRoomOwner;

public class CarRunner {
	
	public static void main(String[] args) {
		
		
		 CarShowRoomOwner owner = new  CarShowRoomOwner();
		Car car=new Car();
		
		
		owner.useCar(car);
		System.out.println("");
		System.out.println("after modifiying: the default variables");
		owner.useCar(car);
		
		System.out.println("");
		System.out.println("access to read");
		
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

	}

}

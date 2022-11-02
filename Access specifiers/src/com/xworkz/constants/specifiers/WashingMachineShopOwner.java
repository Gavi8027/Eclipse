package com.xworkz.constants.specifiers;

public class WashingMachineShopOwner {
	
	public String name="Ramesh";
	public WashingMachine  washingMachine;
	
	public void useWashingMachine(WashingMachine washingMachine) {
		
		
		System.out.println(washingMachine.getBrand());
		System.out.println(washingMachine.getColor());
		System.out.println(washingMachine.getPrice());
		System.out.println(washingMachine.getAmbasassador());
		System.out.println(washingMachine.getUseFull());
		System.out.println(washingMachine.getQuantity());
		System.out.println(washingMachine.getWeight());
		System.out.println(washingMachine.getHavingWheels());
		System.out.println(washingMachine.getRating());
		System.out.println(washingMachine.getNoOfDisplay());
		System.out.println(washingMachine.getType());
		System.out.println(washingMachine.getCmpanyHeadquaretrs());
		
		washingMachine.setBrand("samsung","White",75000,"Ayushmann Khurrana",true,1,30,true,4,1,"Automatic","Nagpur");
		
	}		

}

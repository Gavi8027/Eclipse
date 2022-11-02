package com.xworkz.constants.specifiers.boot;

import com.xworkz.constants.specifiers.WashingMachine;
import com.xworkz.constants.specifiers.WashingMachineShopOwner ;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		
		

		WashingMachineShopOwner  owner = new  WashingMachineShopOwner ();
		WashingMachine washingMachine=new WashingMachine();
		
		
		owner.useWashingMachine(washingMachine);
		System.out.println("");
		System.out.println("after modifiying: the default variables");
		owner.useWashingMachine(washingMachine);
		
		System.out.println("");
		System.out.println("access to read");
		
		
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


	}

}

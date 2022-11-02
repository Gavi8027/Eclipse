package com.xworkz.constants.specifiers;

public class ShopOwner {
	public String name;
	public Laptop laptop;
	
	public void useLaptop(Laptop laptop) {
		
		
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getColor());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getAmbasassador());
		System.out.println(laptop.getUseFull());
		System.out.println(laptop.getQuantity());
		System.out.println(laptop.getWeight());
		System.out.println(laptop.getKeyBoard());
		System.out.println(laptop.getSize());
		System.out.println(laptop.getRam());
		System.out.println(laptop.getTypeOfStorage());
		System.out.println(laptop.getBattry());
		
		laptop.setBrand("intel","silver",24999,"shah rukh khan",true,350,5,true,13,4,"HDD","lithium ion");
		
		
		
	}
	
	

}

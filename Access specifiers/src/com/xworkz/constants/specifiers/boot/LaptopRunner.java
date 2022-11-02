package com.xworkz.constants.specifiers.boot;

import com.xworkz.constants.specifiers.Laptop;

import com.xworkz.constants.specifiers.ShopOwner;

public class LaptopRunner {
	
	
	public static void main (String[] args) {
		ShopOwner owner = new ShopOwner();
		Laptop laptop=new Laptop();
		
		
		owner.useLaptop(laptop);
		System.out.println("");
		System.out.println("after modifiying: the default variables");
		owner.useLaptop(laptop);
		
		System.out.println("");
		System.out.println("access to read");
		
		System.out.println("ShopOwner name is"+owner.name );
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
		
		
		
	}

}

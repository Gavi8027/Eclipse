package com.xworkz.things.boot;

import com.xworkz.things.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chocolate Chocolate1=new Chocolate();
		System.out.println(Chocolate1.name);
		System.out.println(Chocolate1.brand);
		System.out.println(Chocolate1.price);
		System.out.println(Chocolate1.flavour);
		
		Chocolate1.name="milky bar";
		Chocolate1.brand="NESTLE";
		Chocolate1.price=100;
		Chocolate1.flavour="Milk";
		
		System.out.println(Chocolate1.name);
		System.out.println(Chocolate1.brand);
		System.out.println(Chocolate1.price);
		System.out.println(Chocolate1.flavour);
		

	}

}

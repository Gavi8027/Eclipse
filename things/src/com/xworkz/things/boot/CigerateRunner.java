package com.xworkz.things.boot;

import com.xworkz.things.Cigerate;

public class CigerateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cigerate Cigerate1=new Cigerate();
		System.out.println(Cigerate1.price);
		System.out.println(Cigerate1.brand);
		System.out.println(Cigerate1.company);
		System.out.println(Cigerate1.color);
		System.out.println(Cigerate1.length);
		System.out.println(Cigerate1.ash);
		System.out.println(Cigerate1.combination);
		System.out.println(Cigerate1.harmFullToHumans);
		
		
		Cigerate1.madeBy="tobaco";
		Cigerate1.flavour="apple";
		Cigerate1.weight="0.3g";
		Cigerate1.radius="4";
		Cigerate1.tobacoColor="brown";
		
		System.out.println(Cigerate1.madeBy);
		System.out.println(Cigerate1.flavour);
		System.out.println(Cigerate1.weight);
		System.out.println(Cigerate1.radius);
		System.out.println(Cigerate1.tobacoColor);
		
		

	}

}

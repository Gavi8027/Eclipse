package com.xworkz.things.boot;

import com.xworkz.things.Cigerate;
import com.xworkz.things.RMD; 

public class RMDRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RMD RMD1=new RMD();
	
		System.out.println(RMD1.price);
		System.out.println(RMD1.brand);
		System.out.println(RMD1.company);
		System.out.println(RMD1.color);
		System.out.println(RMD1.length);
		System.out.println(RMD1.ash);
		System.out.println(RMD1.combination);
		System.out.println(RMD1.harmFullToHumans);
		
		RMD1.madeBy="tobaco";
		RMD1.flavour="SUPER";
		RMD1.weight="0.1g";
		RMD1.radius="3";
		RMD1.tobacoColor="grey";
		
		System.out.println(RMD1.madeBy);
		System.out.println(RMD1.flavour);
		System.out.println(RMD1.weight);
		System.out.println(RMD1.radius);
		System.out.println(RMD1.tobacoColor);
		
		

	}

}

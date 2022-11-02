package com.xworkz.constants.specifiers.boot;

import com.xworkz.constants.specifiers.Mobile;
import com.xworkz.constants.specifiers.MobileShopOwner;

public class MobileRunner {

	public static void main(String[] args) {
		
		
	
			MobileShopOwner owner = new MobileShopOwner();
			Mobile mobile=new Mobile();
			
			
			owner.useMobile(mobile);
			System.out.println("");
			System.out.println("after modifiying: the default variables");
			owner.useMobile(mobile);
			
			System.out.println("");
			System.out.println("access to read");
			
			System.out.println("MobileShopOwner name is"+owner.name );
			System.out.println(mobile.getBrand());
			System.out.println(mobile.getColor());
			System.out.println(mobile.getPrice());
			System.out.println(mobile.getAmbasassador());
			System.out.println(mobile.getDualSim());
			System.out.println(mobile.getQuantity());
			System.out.println(mobile.getWeight());
			System.out.println(mobile.getEasyToCarry());
			System.out.println(mobile.getSize());
			System.out.println(mobile.getRam());
			System.out.println(mobile.getCategory());
			System.out.println(mobile.getBattry());
			
			

	}

}

package com.xworkz.constants.specifiers.boot;

import com.xworkz.constants.specifiers.Bulb;
import com.xworkz.constants.specifiers.BulbShopOwner;

public class BulbRunner {

	public static void main(String[] args) {
		
		
		BulbShopOwner owner = new BulbShopOwner();
		Bulb bulb=new Bulb();
		
		
		owner.useBulb(bulb);
		System.out.println("");
		System.out.println("after modifiying: the default variables");
		owner.useBulb(bulb);
		
		System.out.println("");
		System.out.println("access to read");
		System.out.println(bulb.getName());
		System.out.println(bulb.getColor());
		System.out.println(bulb.getPrice());
		System.out.println(bulb.getShape());
		System.out.println(bulb.getWeight());
		System.out.println(bulb.getIllumination());
		System.out.println(bulb.getHavingTungsten());
		System.out.println(bulb.getHavingThread());
		System.out.println(bulb.getambassador());
		
	}

}

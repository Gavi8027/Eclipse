package com.xworkz.constant.equals.boot;

import com.xworkz.constant.equals.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {

		
		WaterBottle waterbottle=new WaterBottle();
		waterbottle.setName("maddox");
		waterbottle.setMaterial("plastic");
		waterbottle.setColor("blue");
		waterbottle.setPrice(100);
		waterbottle.setWeight(1);
		waterbottle.setCapacity("20L");
		waterbottle.setSize(1);
		waterbottle.setCarryWater(true);
		waterbottle.setHavingCap(true);
		waterbottle.setDiameter(2.5f);
		
		
		WaterBottle waterbottle1=new WaterBottle("Mia","Steel","pink",80,2,"22L",2,true,true,2.8f);
		
		boolean same=waterbottle.equals(waterbottle1);
		System.out.println(same);
		
	}

}

package com.xworkz.things.boot;

import com.xworkz.things.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {

		DistrictCollector DistrictCollector1=new DistrictCollector();
		System.out.println(DistrictCollector1.name);
		System.out.println(DistrictCollector1.age);
		System.out.println(DistrictCollector1.district);
		System.out.println(DistrictCollector1.batchno);
		
		DistrictCollector1.name="vikas kishore";
		DistrictCollector1.age=35;
		DistrictCollector1.district="koppal";
		DistrictCollector1.batchno=37;
		
		System.out.println(DistrictCollector1.name);
		System.out.println(DistrictCollector1.age);
		System.out.println(DistrictCollector1.district);
		System.out.println(DistrictCollector1.batchno);
		
	}

}

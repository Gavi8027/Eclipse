package com.xworkz.things.boot;

import com.xworkz.things.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		

		
		String[] color={"white","red","blue","black","grey","silver"};
		long[] price={7000,75000,80000,85000,90000,95000};
		int[] mileage = {14,15,16,17,18,19,20};
		String[] tyres= {"MRF","CEAT","APOLLO","GOODYEAR","PIRELLI","MICHELIN"};
		String[] petrolEngine= {"TB","TFSI","TwinAir","EcoBoost","GDi","MIVEC"};
		int[] speedMeter= {80,120,160,180,200,220};
		
		
		Bike bike=new Bike("ramesh",color,price,mileage,true,tyres,petrolEngine,speedMeter);
		bike.display();
		

	
	}

}

package com.xworkz.things.boot;

import com.xworkz.things.Kia;

public class KiaRunner {

	public static void main(String[] args) {
		
		
		String[] color={"white","red","blue","black","grey","silver"};
		long[] price={700000,750000,800000,850000,900000,950000};
		int[] mileage = {14,15,16,17,18,19,20};
		String[] tyres= {"MRF","CEAT","APOLLO","GOODYEAR","PIRELLI","MICHELIN"};
		String[] petrolEngine= {"TB","TFSI","TwinAir","EcoBoost","GDi","MIVEC"};
		int[] speedMeter= {120,140,160,180,200,220};
		
		
		Kia kia=new Kia("ravi",color,price,mileage,true,tyres,petrolEngine,true,speedMeter);
		kia.display();
		
		
		
		
		

	}

}
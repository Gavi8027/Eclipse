package com.xworkz.chaining.constant.boot;
import com.xworkz.chaining.constant.DJ;
import com.xworkz.chaining.constant.Speaker;


public class DJRunner {
	

	public static void main(String[] args) {
		
		DJ dJ=new DJ("DJ FlipBeat",50000,true);
		System.out.println(dJ.companyName);
		System.out.println(dJ.price);
		System.out.println(dJ.soundPollution);
		
		Speaker dJ1=new Speaker("DJ Robin",40000,false);
		System.out.println(dJ1.companyName);
		System.out.println(dJ1.price);
		System.out.println(dJ1.soundPollution);
		
		
	}


}

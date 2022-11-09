package com.xworkz.constant.Relation.boot;
import com.xworkz.constant.Relation.Satellite;
import com.xworkz.constant.Relation.Moon;
public class SatelliteRunner {
   
	public static void main (String[] args) {
		Satellite satellite=new Satellite("Antariksha",400);
		satellite.display();
		System.out.println("============");
		
		
		Moon moon =new Moon("Space",462,true);
		moon.display();
	}
}

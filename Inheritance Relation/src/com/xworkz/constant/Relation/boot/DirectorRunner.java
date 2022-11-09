package com.xworkz.constant.Relation.boot;

import com.xworkz.constant.Relation.Director;
import com.xworkz.constant.Relation.Prashant;


public class DirectorRunner {
     
	public static void main(String [] args) {
		Director director=new Director("Company",30);
		director.display();
		System.out.println("==============");
		
		
		Prashant prashant=new Prashant("Film Director",22,44);
		prashant.display();
	}
}

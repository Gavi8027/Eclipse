package com.xworkz.chaining.constant.boot;
import com.xworkz.chaining.constant.Dowry;
import com.xworkz.chaining.constant.Money;
public class DowryRunner {
	
	public static void main(String[] args) {
		
		Dowry dowry=new Dowry("Gold",2,"inHome");
		System.out.println(dowry.location);
		System.out.println(dowry.noOfPeople);
		System.out.println(dowry.property);
		
		
		Money dowry1=new Money("Cash",1,"inFunctionHall");
		System.out.println(dowry1.location);
		System.out.println(dowry1.noOfPeople);
		System.out.println(dowry1.property);
		
	}

}

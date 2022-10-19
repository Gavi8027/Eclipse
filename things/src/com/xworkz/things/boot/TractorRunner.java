package com.xworkz.things.boot;

import com.xworkz.things.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		Tractor tractor = new Tractor("creating default constractor");
		System.out.println(tractor);
		
		System.out.println(System.lineSeparator());
		Tractor tractor1= new Tractor("ramu");
		System.out.println(tractor1.ownername);
	
		System.out.println(System.lineSeparator());
		Tractor tractor2= new Tractor("Mahindra",6.40);
		System.out.println(tractor2.brand);
		System.out.println(tractor2.price);
		
		System.out.println(System.lineSeparator());
		Tractor tractor3= new Tractor(6.40);
		System.out.println(tractor3.price);
		
		System.out.println(System.lineSeparator());
		Tractor tractor4= new Tractor(6.40,"Red");
		System.out.println(tractor4.price);
		System.out.println(tractor4.color);
		
		System.out.println(System.lineSeparator());
		Tractor tractor5= new Tractor("Red","Mahindra",6.40);
		System.out.println(tractor5.color);
		System.out.println(tractor5.brand);
		System.out.println(tractor5.price);
		
		System.out.println(System.lineSeparator());
		Tractor tractor6= new Tractor("ramu","mahindra","Mahindra Yuvo 450DI");
		System.out.println(tractor6.ownername);
		System.out.println(tractor6.brand);
		System.out.println(tractor6.model);
		
		System.out.println(System.lineSeparator());
		Tractor tractor7= new Tractor("ramu","Mahindra","Mahindra Yuvo 450DI","Red",6.40);
		System.out.println(tractor7.ownername);
		System.out.println(tractor7.brand);
		System.out.println(tractor7.model);
		System.out.println(tractor7.color);
		System.out.println(tractor7.price);
		
		
		
		
		
		
		

	}

}

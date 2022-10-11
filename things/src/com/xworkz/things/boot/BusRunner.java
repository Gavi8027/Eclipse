package com.xworkz.things.boot;

	import  com.xworkz.things.Bus;
public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus Bus1=new Bus();
		System.out.println(Bus1.no);
		System.out.println(Bus1.Starting);
		System.out.println(Bus1.destination);
		
		Bus1.no =1213;
		Bus1.Starting="koppal";
		Bus1.destination="bengalore";
		
		System.out.println(Bus1.no);
		System.out.println(Bus1.Starting);
		System.out.println(Bus1.destination);
		

	}

}

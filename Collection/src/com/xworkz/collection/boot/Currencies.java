package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Currencies {

	public static void main(String[] args) {

		String currencies = "Rupees";
		String currencies1 = "Dolor";
		String currencies2 = "Dhiram";
		String currencies3 = "Euro";
		String currencies4 = "JPY";
		String currencies5 = "AUD";
		String currencies6 = "AZN";
		String currencies7 = "BSD";
		String currencies8 = "ARS";
		String currencies9 = "DZD";
		String currencies10 = "BHD";
		String currencies11 = "BBD";
		String currencies12 = "BYN";
		String currencies13 = "BYR";
		String currencies14 = "BOB";
		String currencies15 = "BRL";
		String currencies16 = "GBP";
		String currencies17 = "BND";
		String currencies18 = "MMK";
		String currencies19 = "KHR";

		Collection collection = new ArrayList();
		collection.add(currencies);
		collection.add(currencies1);
		collection.add(currencies2);
		collection.add(currencies3);
		collection.add(currencies4);
		collection.add(currencies5);
		collection.add(currencies6);
		collection.add(currencies7);
		collection.add(currencies8);
		collection.add(currencies9);
		collection.add(currencies10);
		collection.add(currencies11);
		collection.add(currencies12);
		collection.add(currencies13);
		collection.add(currencies14);
		collection.add(currencies15);
		collection.add(currencies16);
		collection.add(currencies17);
		collection.add(currencies18);
		collection.add(currencies19);

		System.out.println(collection);

		System.out.println("Before clearing");

		System.out.println(collection.size());

		collection.clear();

		System.out.println("After clearing");
		System.out.println(collection.size());

	}

}

package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNamesRunner {

	public static void main(String[] args) {

		String city1 = "Majestic";
		String city2 = "RajajiNagara";
		String city3 = "VijayNagara";
		String city4 = "Nagasandra";
		String city5 = "Magadi";

		Collection<String> cities = new ArrayList<String>();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);

		System.out.println("animals array list");

		System.out.println(cities);

		System.out.println(cities.size());

		for (String gavi : cities) {
			System.out.println(gavi);
		}

		System.out.println("===============================Iterator=========================");

		Iterator<String> ref = cities.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}

	}

}

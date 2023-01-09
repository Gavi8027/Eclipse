package com.xworkz.map.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CityAndTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> map = new LinkedHashMap<String, Double>();

		map.put("Bengalore", 22.3d);
		map.put("Musuru", 27.6d);
		map.put("Ballari", 39.8d);
		map.put("Gulburga", 41.8d);
		map.put("Bidar", 33.4d);
		map.put("Rajstan", 49.99d);
		map.put("J&K", -2.83d);
		map.put("USA", -3.93d);
		map.put("OOti", 18.83d);

		System.out.println(map.size());

		if (map.isEmpty()) {
			System.out.println("Dat is absent");

		} else {
			System.out.println("Data is present");

		}
		System.out.println("===========entering keys===============");

		Set<String> keys = map.keySet();
		keys.forEach(s -> System.out.println(s));

		System.out.println("===============entering values============");
		Collection<Double> value = map.values();
		value.forEach(q -> System.out.println(q));

		System.out.println("===========Entering both value and keys=======");

		Set<Entry<String, Double>> entries = map.entrySet();
		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}
}

package com.xworkz.map.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AreaAndPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> map = new LinkedHashMap<String, Double>();

		map.put("Koppal", 583231d);
		map.put("Ballari", 583101d);
		map.put("Gadag", 598403d);
		map.put("HUbballi", 509372d);
		map.put("Bagalakota", 501234d);
		map.put("Raichur", 972587d);
		map.put("Bengalore", 509271d);
		map.put("Dharawad", 5623820d);
		map.put("Mysuru", 483937d);
		map.put("Gangavati", 479021d);

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

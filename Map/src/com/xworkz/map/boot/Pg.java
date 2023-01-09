package com.xworkz.map.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pg {

	public static void main(String[] args) {

		Map<String, Double> map = new LinkedHashMap<String, Double>();
		map.put("Golden villa", 563839d);
		map.put("Saroja", 567483d);
		map.put("Sai", 648392d);
		map.put("Guru", 503938d);
		map.put("om", 648393d);
		map.put("Ganesh", 59403d);
		map.put("Uma", 903822d);
		map.put("Ranga", 5940382d);
		map.put("Rajesh", 574903d);
		map.put("Raki", 564840d);

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
			// System.out.println(entry.getValue());

		}

	}

}

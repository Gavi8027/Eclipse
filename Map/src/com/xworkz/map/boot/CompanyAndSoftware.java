package com.xworkz.map.boot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CompanyAndSoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("Infosys", "java");
		map.put("IBM", "maven");
		map.put("Accenture", "Billing software");
		map.put("Wipro", "Database");
		map.put("TCS", "payrol");
		map.put("Capgimini", "word processing");
		map.put("Amazon", "AWS");
		map.put("Congizent", "Graphics");

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
		Collection<String> value = map.values();
		value.forEach(q -> System.out.println(q));

		System.out.println("===========Entering both value and keys=======");

		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}
}

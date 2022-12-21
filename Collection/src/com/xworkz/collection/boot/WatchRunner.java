package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) {

		String watch1 = "Luxe";
		String watch2 = "Fastrack";
		String watch3 = "Boat";
		String watch4 = "Apple";
		String watch5 = "Sonata";

		Collection<String> watches = new ArrayList<String>();
		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		watches.add(watch4);
		watches.add(watch5);

		System.out.println("watches array list");

		System.out.println(watches);

		System.out.println(watches.size());

		for (String element : watches) {
			System.out.println(element);
		}

		System.out.println("===================");

		Iterator<String> ref = watches.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}

	}

}

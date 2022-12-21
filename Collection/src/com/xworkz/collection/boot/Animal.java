package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {

		String animale1 = "Lion";
		String animale2 = "Tiger";
		String animale3 = "Cheeta";
		String animale4 = "Deer";
		String animale5 = "Elephant";
		String animale6 = "Dog";
		String animale7 = "Cat";
		String animale8 = "Monkey";
		String animale9 = "Rabbit";

		Collection<String> collection = new ArrayList<String>();

		collection.add(animale1);
		collection.add(animale2);
		collection.add(animale3);
		collection.add(animale4);
		collection.add(animale5);
		collection.add(animale6);
		collection.add(animale7);
		collection.add(animale8);
		collection.add(animale9);

		System.out.println("animals array list");

		System.out.println(collection);

		System.out.println(collection.size());

		for (String element : collection) {
			System.out.println(element);
		}

		System.out.println("====Iterator=====");

		Iterator<String> ref = collection.iterator();
		while (ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}

	}

}

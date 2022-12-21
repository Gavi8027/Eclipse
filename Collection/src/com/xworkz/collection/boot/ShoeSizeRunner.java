package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {

		int shoes1 = 1;
		int shoes2 = 2;
		int shoes3 = 3;
		int shoes4 = 4;
		int shoes5 = 5;
		int shoes6 = 6;
		int shoes7 = 7;
		int shoes8 = 8;
		int shoes9 = 9;
		int shoes10 = 10;
		int shoes11 = 11;
		int shoes12 = 12;
		int shoes13 = 13;
		int shoes14 = 14;
		int shoes15 = 15;

		Collection<Integer> sizes = new ArrayList<Integer>();

		sizes.add(shoes1);
		sizes.add(shoes2);
		sizes.add(shoes3);
		sizes.add(shoes4);
		sizes.add(shoes5);
		sizes.add(shoes6);
		sizes.add(shoes7);
		sizes.add(shoes8);
		sizes.add(shoes9);
		sizes.add(shoes10);
		sizes.add(shoes11);
		sizes.add(shoes12);
		sizes.add(shoes13);
		sizes.add(shoes14);
		sizes.add(shoes15);

		System.out.println("animals array list");

		System.out.println(sizes);

		System.out.println(sizes.size());

		for (Integer ref : sizes) {
			System.out.println(ref);
		}

		System.out.println("==========Iterator============");

		Iterator<Integer> ref = sizes.iterator();
		while (ref.hasNext()) {
			Integer element = ref.next();
			System.out.println(element);
		}

	}

}

package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		System.out.println("Adding the element");
		list.add("R");
		list.add("Y");
		list.add("M");
		list.add("E");
		list.add("C");

		for (String string : list) {
			System.out.println(string);

		}

		list.add(1, "V");
		list.add(6, "G");
		System.out.println("Adding or shifting element");
		for (String string : list) {
			System.out.println(string);

		}

		list.remove(1);
		list.remove(5);
		System.out.println("Removing elements");
		for (String string : list) {
			System.out.println(string);

		}

		list.set(1, "Z");
		list.set(4, "Q");
		System.out.println("Updating elements");
		for (String string : list) {
			System.out.println(string);

		}

		list.get(0);
		System.out.println("Getting required element");
		for (String string : list) {
			System.out.println(string);

		}

	}

}

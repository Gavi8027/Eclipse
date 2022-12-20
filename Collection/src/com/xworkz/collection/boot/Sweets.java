package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Sweets {

	public static void main(String[] args) {

		String sweet1 = "Jammunu";
		String sweet2 = "Pedha";
		String sweet3 = "Mysuru pak";
		String sweet4 = "Jalebi";
		String sweet5 = "Kardantu";
		String sweet6 = "Kajju katli";
		String sweet7 = "Rasmalia";
		String sweet8 = "Holige";
		String sweet9 = "Sahvige Payasa";
		String sweet10 = "Modaka";
		String sweet11 = "Sira";
		String sweet12 = "Sona papade";
		String sweet13 = "Ghevar";

		Collection collection = new ArrayList();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);

		System.out.println(collection);

		System.out.println("Before clearing");

		System.out.println(collection.size());

		collection.clear();

		System.out.println("After clearing");
		System.out.println(collection.size());

	}

}

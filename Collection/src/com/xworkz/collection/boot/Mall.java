package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Mall {

	public static void main(String[] args) {

		String mall = "Sarath";
		String mall1 = "Orion";
		String mall2 = "lulu";
		String mall3 = "Garuda";
		String mall4 = "Manti squre";
		String mall5 = "BIGG Bazar";
		String mall6 = "Zudio";
		String mall7 = "Hyper";
		String mall8 = "z squre";
		String mall9 = "Hilite";
		String mall10 = "World trade park mall";
		String mall11 = "Pheonix";
		String mall12 = "Elanate";
		String mall13 = "Esplanade";
		String mall14 = "Ambience";
		String mall15 = "The Forum";
		String mall16 = "High Street Phoneix";
		String mall17 = "The Great Indian Place";
		String mall18 = "Pacific";
		String mall19 = "The Garden Venice";

		Collection collection = new ArrayList();
		collection.add(mall);
		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);
		collection.add(mall11);
		collection.add(mall12);
		collection.add(mall13);
		collection.add(mall14);
		collection.add(mall15);
		collection.add(mall16);
		collection.add(mall15);
		collection.add(mall16);
		collection.add(mall17);
		collection.add(mall18);
		collection.add(mall19);

		System.out.println(collection);

		System.out.println("Before clearing");

		System.out.println(collection.size());

		collection.clear();

		System.out.println("After clearing");
		System.out.println(collection.size());

	}

}

package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import sun.misc.Queue;

public class Collect {

	public static void main(String[] args) {

		String bike = "Royal Enfield";
		String bike1 = "Hero Honda";
		String bike2 = "Aprilla";
		String bike3 = "Raven";
		String bike4 = "Nova";
		String bike5 = "Patriot";
		String bike6 = "Panther";
		String bike7 = "Forger";
		String bike8 = "Silver Bullet";
		String bike9 = "Pegasus";
		String bike10 = "Phoenix";
		String bike11 = "Firefly";
		String bike12 = "Siren";
		String bike13 = "Stiletto";
		String bike14 = "Blackbird";
		String bike15 = "Venom";
		String bike16 = "Hydra";
		String bike17 = "Shadow";
		String bike18 = "Bimota";
		String bike19 = "Horse power bikes";
		String bike20 = "West End Bicycles";
		String bike21 = "Cooper Bikes";
		String bike22 = "Bumblebee";
		String bike23 = "Bucephalus";
		String bike24 = "Bonnie";
		String bike25 = "Ebony";
		String bike26 = "Stiletto";
		String bike27 = "Kermit";
		String bike28 = "Rocketman";
		String bike29 = "Tequila";
		String bike30 = "Patriot";

		Collection<String> collection = new ArrayList();
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		collection.add(bike19);
		collection.add(bike20);
		collection.add(bike21);
		collection.add(bike22);
		collection.add(bike23);
		collection.add(bike24);
		collection.add(bike25);
		collection.add(bike26);
		collection.add(bike27);
		collection.add(bike28);
		collection.add(bike29);
		collection.add(bike30);

		System.out.println(collection);

		System.out.println("Before clearing");

		System.out.println(collection.size());

		collection.clear();

		System.out.println("After clearing");
		System.out.println(collection.size());

	}

}

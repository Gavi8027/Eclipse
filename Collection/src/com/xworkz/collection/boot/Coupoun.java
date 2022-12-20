package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Coupoun {

	public static void main(String[] args) {

		String coupoun = "DealDay Coupoun";
		String coupoun1 = "Coupoun express";
		String couopon2 = "CoupounVibe";
		String couopon3 = "CrazyDots";
		String couopon4 = "DealDive";
		String couopon5 = "PopcornDeal";
		String couopon6 = "Goodfun";
		String couopon7 = "Dealskill";
		String couopon8 = "sundayFlirt";
		String couopon9 = "happyDaisy";
		String couopon10 = "coupoun yele";
		String couopon11 = "Dude town";
		String couopon12 = "SaverThings";
		String couopon13 = "Dealbyte";
		String couopon14 = "Obliq";
		String couopon15 = "Victorable";
		String couopon16 = "Aeronns coupouns";
		String couopon17 = "Rossells";
		String couopon18 = "Casaprime";
		String couopon19 = "Virgohue";
		String couopon20 = "EarlyWish";

		Collection collection = new ArrayList();
		collection.add(coupoun);
		collection.add(coupoun1);
		collection.add(couopon2);
		collection.add(couopon3);
		collection.add(couopon4);
		collection.add(couopon5);
		collection.add(couopon6);
		collection.add(couopon7);
		collection.add(couopon8);
		collection.add(couopon9);
		collection.add(couopon10);
		collection.add(couopon11);
		collection.add(couopon12);
		collection.add(couopon13);
		collection.add(couopon14);
		collection.add(couopon15);
		collection.add(couopon16);
		collection.add(couopon17);
		collection.add(couopon18);
		collection.add(couopon19);
		collection.add(couopon20);

		System.out.println(collection);

		System.out.println("Before clearing");

		System.out.println(collection.size());

		collection.clear();

		System.out.println("After clearing");
		System.out.println(collection.size());

	}

}

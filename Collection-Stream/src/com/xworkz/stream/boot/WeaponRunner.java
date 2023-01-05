package com.xworkz.stream.boot;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.constant.WeaponType;
import com.xworkz.stream.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {

		Collection<WeaponDTO> collection = new ArrayList<WeaponDTO>();
		collection.add(new WeaponDTO("air gun", "ravi", LocalDate.of(2020, 10, 15), 12764D, WeaponType.BOOMERANG));
		collection.add(new WeaponDTO("blowgun", "ramesh", LocalDate.of(2019, 4, 04), 45897D, WeaponType.Nuclear));
		collection.add(new WeaponDTO("blunderbuss", "gopala", LocalDate.of(2013, 5, 18), 78958D, WeaponType.ANTHRAX));
		collection.add(new WeaponDTO("harquebus", "rana", LocalDate.of(2011, 8, 19), 187958D, WeaponType.ANTITANK));
		collection.add(new WeaponDTO("musket", "ranga", LocalDate.of(2009, 9, 28), 985D, WeaponType.ANTITANK));
		collection.add(new WeaponDTO("anthrax", "manja", LocalDate.of(2018, 11, 21), 12764D, WeaponType.Nuclear));
		collection.add(new WeaponDTO("adamsite", "kencha", LocalDate.of(1999, 1, 14), 12764D, WeaponType.BOOMERANG));
		collection.add(new WeaponDTO("sword", "pramoda", LocalDate.of(1879, 5, 15), 12764D, WeaponType.ANTHRAX));
		collection.add(new WeaponDTO("greek fire", "vishal", LocalDate.of(2012, 11, 9), 12764D, WeaponType.ANTITANK));
		collection.add(new WeaponDTO("dirty bomb", "shankar", LocalDate.of(2014, 1, 8), 12764D, WeaponType.BOOMERANG));

		System.out.println(" weapons Price grater than ");
		

		collection.stream().filter((ele) -> ele.getPrice() > 10000).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("=========================================== ");
		System.out.println("Print all made on and madeby ");
		collection.stream()
				.forEach(e -> System.out.println("made by and made on" + e.getMadeBy() + " : " + e.getMadeOn()));

		System.out.println("=========================================== ");
		System.out.println("weapons name  by descending order ");

		collection.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("============================================== ");
		System.out.println("weapons made by ascending order ");

		collection.stream().sorted((e1, e2) -> e1.getMadeBy().compareTo(e2.getMadeBy()))
				.forEach(e -> System.out.println(e.getMadeBy()));

		System.out.println("==================================================");
		System.out.println("weapons made ascending order ");

		collection.stream().sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn()))
				.forEach(e -> System.out.println(e.getMadeOn()));

		System.out.println("===================================================");
		System.out.println("weapons price in ascending order ");

		System.out.println("");
		System.out.println("weapons sort by madeon and name ascending order  ");

		collection.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
				.forEach(e -> System.out.println("Printing name and made on " + e.getName() + " : " + e.getMadeOn()));

		System.out.println("========================================================");
		System.out.println("weapons sort by Type,madeBy and name ascending order  ");

		collection.stream().sorted((e1, e2) -> e1.getType().compareTo(e2.getType()))
				.sorted((b1, b2) -> b1.getMadeBy().compareTo(b2.getMadeBy()))
				.sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
				.forEach(e -> System.out.println("Printing type  and made by and name  " + e.getType() + " : "
						+ e.getMadeBy() + " :" + e.getName()));

	}

}

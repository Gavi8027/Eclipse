package com.xworkz.collection.boot;

import java.util.LinkedHashSet;

import java.util.Set;

import com.xworkz.collection.dto.CakeDTO;

public class CakeDTORunner {

	public static void main(String[] args) {

		CakeDTO cake1 = new CakeDTO("Red Valvet", 800, "White", "Heart");
		CakeDTO cake2 = new CakeDTO("Red Valvet", 800, "White", "Heart");
		CakeDTO cake3 = new CakeDTO("Red Valvet", 800, "White", "Heart");
		CakeDTO cake4 = new CakeDTO("Chacolate", 800, "White", "Heart");

		Set<CakeDTO> set = new LinkedHashSet();
		set.add(cake1);
		set.add(cake2);
		set.add(cake3);
		set.add(cake4);

		for (Object ref : set) {
			System.out.println("Overriden : " + ref.hashCode());
			System.out.println("Original : " + System.identityHashCode(ref));
			System.out.println(ref);

		}
		
		

	}

}

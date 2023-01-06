package com.xworkz.collection.boot;

import java.util.LinkedHashSet;
import java.util.Set;

import com.xworkz.collection.dto.CakeDTO;
import com.xworkz.collection.dto.TheaterDTO;

public class TheaterRunner {

	public static void main(String[] args) {

		TheaterDTO theater1 = new TheaterDTO("Navaranga", "Rajajinagara", "Vedha", 8.5f);
		TheaterDTO theater2 = new TheaterDTO("Sujata", "Rajajinagara", "Vedha", 8.5f);
		TheaterDTO theater3 = new TheaterDTO("Navaranga", "Rajajinagara", "Vedha", 8.5f);
		TheaterDTO theater4 = new TheaterDTO("Nartaki", "Majestic", "Vijayananda", 7.5f);
		TheaterDTO theater5 = new TheaterDTO("Navaranga", "Rajajinagara", "Vedha", 8.5f);

		Set<TheaterDTO> set = new LinkedHashSet();
		set.add(theater1);
		set.add(theater2);
		set.add(theater3);
		set.add(theater4);
		set.add(theater5);

		for (TheaterDTO theaterDTO : set) {
			System.out.println("Overriden : " + theaterDTO.hashCode());
			System.out.println("Original : " + System.identityHashCode(theaterDTO));
			System.out.println(theaterDTO);

		}

	}

}

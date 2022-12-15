package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepository;
import com.xworkz.ipl.repository.WarRepositoryimpl;

public class WarRunner {

	public static void main(String[] args) {

		WarRepository warRepository = new WarRepositoryimpl();

		WarDTO war = new WarDTO("Kargil", LocalDateTime.of(1999, 3, 5, 10, 30), LocalDateTime.of(1999, 26, 7, 9, 30),
				"China", "solderis", 525);

		// war.setName("Kargil");
		// war.setStartDate(LocalDateTime.of(1999, 3, 5, 10, 30));
		// war.setEndDate(LocalDateTime.of(1999, 26, 7, 9, 30));
		// war.setNoOfDeath(525);
		// war.setStartBy("Pakistan");
		// war.setStartedWith("Solderis");

		warRepository.fight(war);
		System.out.println(warRepository.total());
		WarDTO war1 = warRepository.findBystartBy("China");
		System.out.println(war1);
		System.out.println("\n");
		
		
		WarDTO war11 = new WarDTO("Kargil", LocalDateTime.of(1999, 3, 5, 10, 30), LocalDateTime.of(1999, 26, 7, 9, 30),
				"China", "solderis", 525);

	}
	
	

}

package com.xworkz.examples.constant.boot;

import java.time.LocalDateTime;

import com.xworkz.examples.constant.dto.TheaterDTO;
import com.xworkz.examples.constant.repository.TheaterRepository;
import com.xworkz.examples.constant.repository.TheaterRepositoryImpl;
import com.xworkz.examples.constant.service.TheaterService;
import com.xworkz.examples.constant.service.TheatererviceImpl;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public class TheaterRunner {

	private static TheaterDTO theaterDTO;

	public static void main(String[] args) throws InvalidTheaterDataException {

		TheaterDTO theaterDTO = new TheaterDTO(10, "Navaranga", "cinimex", 500, "Gavi", LocalDateTime.now(), "System",
				LocalDateTime.now());
		TheaterDTO theaterDTO1 = new TheaterDTO(11, "Navaranga", "multiplex", 540, "Gavi", LocalDateTime.now(),
				"System", LocalDateTime.now());
		TheaterDTO theaterDTO2 = new TheaterDTO(12, "Navaranga", "HD", 300, "Gavi", LocalDateTime.now(), "System",
				LocalDateTime.now());
		TheaterDTO theaterDTO3 = new TheaterDTO(13, "Navaranga", "High", 280, "Gavi", LocalDateTime.now(), "System",
				LocalDateTime.now());
		TheaterDTO theaterDTO4 = new TheaterDTO(14, "Navaranga", "UltraHigh", 370, "Gavi", LocalDateTime.now(),
				"System", LocalDateTime.now());
		// TheaterDTO theaterDTO5 = new TheaterDTO(14, "Navaranga", "UltraHigh",
		// 370,"Gavi",LocalDateTime.now(), "System", LocalDateTime.now());

		TheaterRepository theaterRepository = new TheaterRepositoryImpl();

		TheaterService theaterService = new TheatererviceImpl(theaterRepository);

		try {
			System.out.println("");
			theaterService.validateAndSave(theaterDTO);
			System.out.println("");
			theaterService.validateAndSave(theaterDTO1);
			System.out.println("");
			theaterService.validateAndSave(theaterDTO2);
			System.out.println("");
			theaterService.validateAndSave(theaterDTO3);
			System.out.println("");
			theaterService.validateAndSave(theaterDTO4);
			System.out.println("");
			// theaterService.validateAndSave(theaterDTO5);
			System.out.println("");
			// theaterService.validateAndSave(theaterDTO6);

		} 
		catch (InvalidTheaterDataException e) {
		}
	}
}

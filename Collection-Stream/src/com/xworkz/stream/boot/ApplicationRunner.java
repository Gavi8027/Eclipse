package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {

		
		Collection<ApplicationDTO> applicationDTO=new ArrayList<ApplicationDTO>();
		applicationDTO.add(new ApplicationDTO("Zamato", 17.2, true, "Deepinder Goyal", 1490 ));
		
		applicationDTO.add(new ApplicationDTO("Cricbuzz", 4.2, false, " Pankaj Chhaparwal", 1829 ));

		
		applicationDTO.add(new ApplicationDTO("Flipkart", 11.2, true, "google", 190 ));

		
		applicationDTO.add(new ApplicationDTO("IRCTC", 13.2, true, "google", 140 ));
		
		applicationDTO.stream().filter(dto->dto.isFree()).filter(dto->dto.getDevelopedBy().contains("google")).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		
		System.out.println("printing greater than 5 version list");
		
		applicationDTO.stream().filter(dto->dto.getVersion()>5).collect(Collectors.toSet()).forEach(dto->System.out.println(dto.getName()));
		

	}

}

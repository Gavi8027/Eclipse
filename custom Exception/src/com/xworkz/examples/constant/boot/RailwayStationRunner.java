package com.xworkz.examples.constant.boot;

import java.nio.BufferOverflowException;
import java.time.LocalDateTime;
import java.util.prefs.BackingStoreException;

import com.xworkz.examples.constant.dto.RailwayStationDTO;
import com.xworkz.examples.constant.repository.RailwayStationRepository;
import com.xworkz.examples.constant.repository.RailwayStationRepositoryImpl;
import com.xworkz.examples.constant.service.RailwayStationService;
import com.xworkz.examples.constant.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) throws BackingStoreException,BufferOverflowException {

		RailwayStationDTO railwayStationDTO = new RailwayStationDTO();
		railwayStationDTO.setArea("Old hubli");
		railwayStationDTO.setName("Sidharudha");
		railwayStationDTO.setNoOFPlatforms(4);
		railwayStationDTO.setPlatformTicketPrice(20);
		railwayStationDTO.setUpdatedBy("gavi");
		railwayStationDTO.setUpdateddate(LocalDateTime.now());
		railwayStationDTO.setCreatedBy("system");
		railwayStationDTO.setCreatedDate(LocalDateTime.now());

		RailwayStationDTO railwayStationDTO1 = new RailwayStationDTO();
		railwayStationDTO1.setArea("Old hubli");
		railwayStationDTO1.setName("Sidharudha");
		railwayStationDTO1.setNoOFPlatforms(4);
		railwayStationDTO1.setPlatformTicketPrice(20);
		railwayStationDTO1.setUpdatedBy("gavi");
		railwayStationDTO1.setUpdateddate(LocalDateTime.now());
		railwayStationDTO1.setCreatedBy("system");
		railwayStationDTO1.setCreatedDate(LocalDateTime.now());

		RailwayStationDTO railwayStationDTO2 = new RailwayStationDTO();
		railwayStationDTO2.setArea("Old hubli");
		railwayStationDTO2.setName("Sidharudha");
		railwayStationDTO2.setNoOFPlatforms(4);
		railwayStationDTO2.setPlatformTicketPrice(20);
		railwayStationDTO2.setUpdatedBy("gavi");
		railwayStationDTO2.setUpdateddate(LocalDateTime.now());
		railwayStationDTO2.setCreatedBy("system");
		railwayStationDTO2.setCreatedDate(LocalDateTime.now());

		RailwayStationDTO railwayStationDTO3 = new RailwayStationDTO();
		railwayStationDTO3.setArea("Old hubli");
		railwayStationDTO3.setName("Sidharudha");
		railwayStationDTO3.setNoOFPlatforms(4);
		railwayStationDTO3.setPlatformTicketPrice(20);
		railwayStationDTO3.setUpdatedBy("gavi");
		railwayStationDTO3.setUpdateddate(LocalDateTime.now());
		railwayStationDTO3.setCreatedBy("system");
		railwayStationDTO3.setCreatedDate(LocalDateTime.now());

		RailwayStationDTO railwayStationDTO4 = new RailwayStationDTO();
		railwayStationDTO4.setArea("Old hubli");
		railwayStationDTO4.setName("Sidharudha");
		railwayStationDTO4.setNoOFPlatforms(4);
		railwayStationDTO4.setPlatformTicketPrice(20);
		railwayStationDTO4.setUpdatedBy("gavi");
		railwayStationDTO4.setUpdateddate(LocalDateTime.now());
		railwayStationDTO4.setCreatedBy("system");
		railwayStationDTO4.setCreatedDate(LocalDateTime.now());

		RailwayStationRepository railwayStationRepository = new RailwayStationRepositoryImpl();

		RailwayStationService railwayStationService = new RailwayStationServiceImpl(railwayStationRepository);

		try {
			System.out.println("");
			railwayStationService.validateAndSave(railwayStationDTO);

			System.out.println("");
			railwayStationService.validateAndSave(railwayStationDTO1);

			System.out.println("");
			railwayStationService.validateAndSave(railwayStationDTO2);

			System.out.println("");
			railwayStationService.validateAndSave(railwayStationDTO3);

			System.out.println("");
			railwayStationService.validateAndSave(railwayStationDTO4);

		} catch (BackingStoreException e) {

		}
	}

}

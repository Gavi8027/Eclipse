package com.xworkz.examples.constant.boot;

import java.time.LocalDateTime;

import javax.management.JMRuntimeException;

import com.xworkz.examples.constant.dto.BuildingDTO;
import com.xworkz.examples.constant.repository.BuildingRepository;
import com.xworkz.examples.constant.repository.BuildingRepositoryImpl;
import com.xworkz.examples.constant.service.BuildingService;
import com.xworkz.examples.constant.service.BuildingServiceImpl;
import com.xworkz.examples.exception.BadLocationException;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public class BuildingRunner {
	
	private static BuildingDTO buildingDTO;

	public static void main(String[] args) throws BadLocationException, JMRuntimeException {

		BuildingDTO buildingDTO = new BuildingDTO();
		buildingDTO.setName(null);
		buildingDTO.setNo(1);
		buildingDTO.setParking(true);
		buildingDTO.setLift(true);
		buildingDTO.setFloors(5);
		buildingDTO.setType(null);
		buildingDTO.setCreatedBy("gavi");
		buildingDTO.setCreatedDate(LocalDateTime.now());
		buildingDTO.setUpdatedBy("system");
		buildingDTO.setUpdateddate(LocalDateTime.now());

		BuildingDTO buildingDTO1 = new BuildingDTO();
		buildingDTO1.setName(null);
		buildingDTO1.setNo(1);
		buildingDTO1.setParking(true);
		buildingDTO1.setLift(true);
		buildingDTO1.setFloors(5);
		buildingDTO1.setType(null);
		buildingDTO1.setCreatedBy("gavi");
		buildingDTO1.setCreatedDate(LocalDateTime.now());
		buildingDTO1.setUpdatedBy("system");
		buildingDTO1.setUpdateddate(LocalDateTime.now());

		BuildingDTO buildingDTO2 = new BuildingDTO();
		buildingDTO2.setName(null);
		buildingDTO2.setNo(1);
		buildingDTO2.setParking(true);
		buildingDTO2.setLift(true);
		buildingDTO2.setFloors(5);
		buildingDTO2.setType(null);
		buildingDTO2.setCreatedBy("gavi");
		buildingDTO2.setCreatedDate(LocalDateTime.now());
		buildingDTO2.setUpdatedBy("system");
		buildingDTO2.setUpdateddate(LocalDateTime.now());

		BuildingDTO buildingDTO3 = new BuildingDTO();
		buildingDTO3.setName(null);
		buildingDTO3.setNo(1);
		buildingDTO3.setParking(true);
		buildingDTO3.setLift(true);
		buildingDTO3.setFloors(5);
		buildingDTO3.setType(null);
		buildingDTO3.setCreatedBy("gavi");
		buildingDTO3.setCreatedDate(LocalDateTime.now());
		buildingDTO3.setUpdatedBy("system");
		buildingDTO3.setUpdateddate(LocalDateTime.now());

		BuildingDTO buildingDTO4 = new BuildingDTO();
		buildingDTO4.setName(null);
		buildingDTO4.setNo(1);
		buildingDTO4.setParking(true);
		buildingDTO4.setLift(true);
		buildingDTO4.setFloors(5);
		buildingDTO4.setType(null);
		buildingDTO4.setCreatedBy("gavi");
		buildingDTO4.setCreatedDate(LocalDateTime.now());
		buildingDTO4.setUpdatedBy("system");
		buildingDTO4.setUpdateddate(LocalDateTime.now());

		// BuildingDTO buildingDTO5 = new BuildingDTO();
		// buildingDTO5.setName(null);
		// buildingDTO5.setNo(1);
		// buildingDTO5.setParking(true);
		// buildingDTO5.setLift(true);
		// buildingDTO5.setFloors(5);
		// buildingDTO5.setType(null);
		// buildingDTO5.setCreatedBy("gavi");
		// buildingDTO5.setCreatedDate(LocalDateTime.now());
		// buildingDTO5.setUpdatedBy("system");
		// buildingDTO5.setUpdateddate(LocalDateTime.now());

		BuildingRepository buildingRepository = new BuildingRepositoryImpl();

		BuildingService buildingService = new BuildingServiceImpl(buildingRepository);

		try {
			System.out.println("");
			buildingService.validateAndSave(buildingDTO);
			System.out.println("");
			buildingService.validateAndSave(buildingDTO1);
			System.out.println("");
			buildingService.validateAndSave(buildingDTO2);
			System.out.println("");
			buildingService.validateAndSave(buildingDTO3);
			System.out.println("");
			buildingService.validateAndSave(buildingDTO4);
			// System.out.println("");
			// buildingService.validateAndSave(buildingDTO5);

		} catch (BadLocationException e) {

		}

	}

}

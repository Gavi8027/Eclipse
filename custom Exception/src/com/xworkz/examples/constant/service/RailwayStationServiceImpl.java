package com.xworkz.examples.constant.service;

import java.util.prefs.BackingStoreException;

import com.xworkz.examples.constant.dto.RailwayStationDTO;
import com.xworkz.examples.constant.repository.RailwayStationRepository;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public class RailwayStationServiceImpl implements RailwayStationService {

	RailwayStationRepository railwayStationRepository;

	public RailwayStationServiceImpl(RailwayStationRepository railwayStationRepository) {
		this.railwayStationRepository= railwayStationRepository;

	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws BackingStoreException {
		System.out.println("running validateAndSave"+dto);
		String name = dto.getName();
		String area = dto.getArea();
		int noOFPlatforms = dto.getNoOFPlatforms();
		int platformTicketPrice = dto.getNoOFPlatforms();

		boolean validnameValid = false;
		boolean validareaValid = false;
		boolean validnoOFPlatforms = false;
		boolean validplatformTicketPrice = false;

		if (name != null && name.length() >= 3 && name.length() <= 2000) {
			System.out.println("name is valid" + name);
		} else {
			System.out.println("name is invalid");
		}
		if (area != null && area.length() > 3 && area.length() <= 2000) {
			System.out.println("area is valid" + area);
		} else {
			System.out.println("area is invalid");
		}
		if (noOFPlatforms > 0) {
			System.out.println("noOFPlatforms1 is valid");
		} else {
			System.out.println("noOFPlatforms1 is invalid");
		}
		if (platformTicketPrice != 0) {
			System.out.println("platformTicketPrice is valid");
		} else {
			System.out.println("platformTicketPrice is invalid");
		}
		if (validnameValid && validareaValid && validnoOFPlatforms && validplatformTicketPrice) {
			System.out.println("data is valaditing and storing");
			boolean save = this.railwayStationRepository.save(dto);
			System.out.println("data is saved"+save);
		}
		throw new BackingStoreException(area);
	}

}

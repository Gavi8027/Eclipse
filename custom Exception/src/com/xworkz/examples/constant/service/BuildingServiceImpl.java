package com.xworkz.examples.constant.service;

import com.xworkz.examples.constant.Type;


import com.xworkz.examples.constant.dto.BuildingDTO;
import com.xworkz.examples.constant.repository.BuildingRepository;
import com.xworkz.examples.exception.BadLocationException;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public class BuildingServiceImpl implements BuildingService {

	BuildingRepository buildingRepository;

	public BuildingServiceImpl(BuildingRepository buildingRepository) {
		this.buildingRepository = buildingRepository;
	}

	@Override
	public boolean validateAndSave(BuildingDTO dto) throws BadLocationException {
		System.out.println("running validateAndSave" + dto);
		String name = dto.getName();
		int floors = dto.getFloors();
		boolean lift = dto.isLift();
		boolean parking = dto.isParking();
		Type Type = dto.getType();

		boolean nameValid = false;
		boolean floorsValid = false;
		boolean liftValid = false;
		boolean parkingValid = false;

		if (name != null && name.length() > 3 && name.length() < 2000) {
			System.out.println("name is valid" + name);
			nameValid = true;
		} else {
			System.out.println("name is invalid");
		}
		if (floors != 0) {
			System.out.println("floors is valid" + floors);
		} else {
			System.out.println("floors are invalid");
		}
		if (lift != false) {
			System.out.println("lift is valid" + lift);
		} else {
			System.out.println("lift is invalid");
		}
		if (parking != false) {
			System.out.println("parking is valid" + parking);
		} else {
			System.out.println("parking is invalid");
		}
		if (Type != null) {
			System.out.println("type is valid" + Type);
		} else {
			System.out.println("type is invalid");
		}
		if (nameValid && floorsValid && liftValid && parkingValid) {
			System.out.println("data validating");
			boolean save = this.buildingRepository.save(dto);
			System.out.println("valadating and saved sucessfully"+save);
			return save;

		}
		throw new BadLocationException();

	}

}

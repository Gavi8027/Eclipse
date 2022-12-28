package com.xworkz.examples.constant.service;

import java.util.zip.DataFormatException;

import com.xworkz.examples.constant.dto.BakeryDTO;
import com.xworkz.examples.constant.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {

	BakeryRepository bakeryRepository;

	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		this.bakeryRepository = bakeryRepository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws DataFormatException {
		System.out.println("running validateAndSave" + dto);
		String name = dto.getName();
		String owner = dto.getOwner();
		double contact = dto.getContact();
		String location = dto.getFamousFor();
		String famousFor = dto.getFamousFor();

		boolean nameValid = false;
		boolean ownerValid = false;
		boolean contactValid = false;
		boolean locationValid = false;
		boolean famousForValid = false;

		if (name != null && name.length() >= 3 && name.length() <= 2000) {
			System.out.println("name is valid" + name);
			nameValid = true;
		} else {
			System.err.println("name is invalid");
		}
		if (owner != null && owner.length() >= 3 && owner.length() < 2000) {
			System.out.println("owner is valid" + owner);
			ownerValid = true;
		} else {
			System.err.println("owner is invalid");
		}
		if (contact != 0) {
			System.out.println("contact isvalid" + contact);
			contactValid = true;
		} else {
			System.err.println("contact is invalid");
		}
		if (location != null && location.length() > 3 && location.length() < 2000) {
			System.out.println("location iv valid" + contact);
			locationValid = true;
		} else {
			System.err.println("location is invalid");
		}
		if (famousFor != null && famousFor.length() > 3 && famousFor.length() < 2000) {
			System.out.println("famousFor is valid" + famousFor);
			famousForValid = true;
		} else {
			System.out.println("famousFor is invalid");
		}
		if (nameValid && ownerValid && contactValid && locationValid && famousForValid) {
			System.out.println("givin data are validated and can store data ");
			boolean saved = this.bakeryRepository.save(dto);

			System.out.println("given data is saved sucessfully" + saved);
			return saved;

		}
		throw new DataFormatException();

	}

}

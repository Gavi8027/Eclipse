package com.xworkz.examples.constant.service;

import com.xworkz.examples.constant.dto.TheaterDTO;
import com.xworkz.examples.constant.repository.TheaterRepository;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public class TheatererviceImpl implements TheaterService {

	TheaterRepository theaterRepository;

	public TheatererviceImpl(TheaterRepository theaterRepository) {
		this.theaterRepository = theaterRepository;

	}

	@Override
	public boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException {
		System.out.println("running validateAndSave" + dto);
		String name = dto.getBrand();
		int id = dto.getId();
		String brand = dto.getBrand();
		int seats = dto.getSeats();

		boolean nameValid = false;
		boolean idValid = false;
		boolean brandValid = false;
		boolean seatsValid = false;

		if (name != null && name.length() >= 3 && name.length() <= 2000) {
			System.out.println("name is valid" + name);
			nameValid = true;
		} else {
			System.out.println("name is invalid");

		}
		if (brand != null && brand.length() > 3 && brand.length() < 200) {
			System.out.println("brnad is valid " + brand);
			brandValid = true;
		} else {
			System.out.println("btand is invalid" + brand);

		}
		if (id!=0 && id>=2 && id<=1000) {
			System.out.println("id is valid" + id);
			idValid = true;
		} else {
			System.out.println("id is invalid");

		}
		if (seats!=0 &&  seats>=3 && seats <= 900) {
			System.out.println("seats are valid" + seats);
			seatsValid = true;
		} else {
			System.out.println("seats are inValid");

		}
		if (seatsValid && nameValid && idValid && brandValid) {
			System.out.println("data is valadating");
			boolean saved =this.theaterRepository.save(dto);
			System.out.println("after valadating data is saved" + saved);
			return saved;
		}
		throw new InvalidTheaterDataException("After exception");
	}

}

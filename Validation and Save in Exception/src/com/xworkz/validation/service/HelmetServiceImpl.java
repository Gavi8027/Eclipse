package com.xworkz.validation.service;

import com.xworkz.validation.Repository.HelmetRepository;
import com.xworkz.validation.constant.Color;
import com.xworkz.validation.constant.Helmetype;
import com.xworkz.validation.dto.HelmetDTO;

public class HelmetServiceImpl implements HelmetService {

	HelmetRepository helmetRepository;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {

		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		System.out.println("running validation"+dto);
		String name = dto.getBrand();
		Color color = dto.getColor();
		Helmetype type = dto.getType();
		double price = dto.getPrice();

		boolean nameValid = false;
		boolean priceValid = false;
		boolean colorValid = false;
		boolean typeValid = false;

		if (name != null && name.length() > 3 && name.length() < 20) {
			System.out.println("name is valid");
			nameValid = true;
		} else {
			System.out.println("name is invalid" + name);
		}
		if (price != 0 && price >= 200 && price <= 20000) {
			System.out.println("price is valid" + price);
			priceValid = true;
		} else {
			System.out.println("price is invalid");
		}

		if (color != null) {
			System.out.println("color is valid" + color);
			colorValid = true;
		} else {
			System.out.println("color is invalid");
		}
		if (type != null) {
			System.out.println("type is valid" + type);
			typeValid = true;

		} else {
			System.out.println("type is invalid");
		}

		if (nameValid && priceValid && colorValid && typeValid) {
			System.out.println("validate is done");

			boolean saved = this.helmetRepository.save(dto);
			System.out.println("after validating saving the data" + saved);
		
		} else {
			System.out.println("givin data is invalid and not saving");
		}
		return true;

	}

}

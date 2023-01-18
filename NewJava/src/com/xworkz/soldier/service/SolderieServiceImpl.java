package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldiersDTO;

public class SolderieServiceImpl implements SolderieService {

	@Override
	public boolean validateAndSave(SoldiersDTO dto) {

		System.out.println("datas of dto=" + dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<SoldiersDTO>> violations = validator.validate(dto);

		if (!violations.isEmpty()) {
			System.out.println("errors are there in the dto class");

			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;
		} else {
			System.out.println("no errors in the dto class");

			System.out.println("after valaditing the data" + dto);
			return false;

		}
	}

}

package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repository.FirstAidRepo;
import com.xworkz.soldier.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;

	private ResortRepo resortRepo;

	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Creating validateAndSave in ResortServiceImpl");
		System.out.println("dto" + dto);

		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(dto);

		if (!violations.isEmpty()) {
			System.err.println("Data is contaning validation error");
			violations.forEach(e -> System.err.println(e.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid can save");
			boolean saved=this.resortRepo.save(dto);
			System.out.println("saved resort"+ saved);
			return saved;
		}

	}

}

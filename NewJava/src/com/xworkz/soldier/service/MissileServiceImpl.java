package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
import com.xworkz.soldier.repository.MissileRepo;
@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;

	private MissileRepo missileRepo;

	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Running validateAndSave in MissileServiceImpl");
		System.out.println("dto " + dto);

		Set<ConstraintViolation<MissileDTO>> violations = validator.validate(dto);

		if (!violations.isEmpty()) {
			System.out.println("Data is contaning validation error");
			violations.forEach(a -> System.out.println(a.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid can save");
			boolean saved = this.missileRepo.save(dto);
			System.out.println("saved" +" "+saved);
			return true;
		}

	}

}

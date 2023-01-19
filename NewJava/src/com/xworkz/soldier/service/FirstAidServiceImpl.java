package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;

import com.xworkz.soldier.repository.FirstAidRepo;
@Component
public class FirstAidServiceImpl implements FirstAidService{
	@Autowired
	private Validator validator;
	
	private FirstAidRepo firstAidRepo;
	 @Autowired
	 public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("Running validateAndSave");
		System.out.println("dto " + dto);
		
		Set<ConstraintViolation<FirstAidDTO>> violations=  validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("Data is contaning validation error");
			violations.forEach(e->System.err.println(e.getMessage()));
			return false;
		}
		else {
			System.out.println("Data is valid can save");
			boolean saved=this.firstAidRepo.save(dto);
			System.out.println("saved firstAid" +"  "+ saved);
			return saved;
		}
		

	}

}

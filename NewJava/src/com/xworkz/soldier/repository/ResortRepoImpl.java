package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;
@Component
public class ResortRepoImpl implements ResortRepo{

	@Override
	public boolean save(ResortDTO resortDTO) {
		System.out.println("Running save in ResortRepoImpl");
		System.out.println(resortDTO);
		return true;
	}

}

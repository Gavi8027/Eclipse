package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.FirstAidDTO;
@Component
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDTO AidDto) {
		System.out.println("Creating save in FirstAidRepoImpl");
		System.out.println(AidDto);
		return true;
	}

}

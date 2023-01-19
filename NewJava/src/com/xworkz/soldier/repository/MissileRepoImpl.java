package com.xworkz.soldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MissileDTO;
@Component
public class MissileRepoImpl implements MissileRepo{

	@Override
	public boolean save(MissileDTO missileDTO) {
		System.out.println("Creating save in MissileRepoImpl");
		System.out.println(missileDTO);
		return true;
	}

}

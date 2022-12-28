package com.xworkz.examples.constant.repository;

import javax.management.JMRuntimeException;

import com.xworkz.examples.constant.dto.BuildingDTO;



public class BuildingRepositoryImpl implements BuildingRepository {

	private BuildingDTO[] dtos = new BuildingDTO[5];
	private int index = 0;

	@Override
	public boolean save(BuildingDTO dto) throws JMRuntimeException{
		System.out.println("running creat of BuildingDTO" + dto);
		if (this.index > this.dtos.length) {
			System.out.println("array size is exceeded");
		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}

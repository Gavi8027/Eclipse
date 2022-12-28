package com.xworkz.examples.constant.repository;

import java.nio.BufferOverflowException;

import com.xworkz.examples.constant.dto.RailwayStationDTO;
import com.xworkz.examples.exception.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {

	private RailwayStationDTO[] dtos = new RailwayStationDTO[5];
	private int currentindex = 0;

	@Override
	public boolean save(RailwayStationDTO dto) throws BufferOverflowException {
		System.out.println("running RailwayStationDTO" + dto);
		if (this.currentindex >= this.dtos.length) {
			System.out.println("array size is exceede");
			throw new StorageFullException("storage is full");

		}
		this.dtos[this.currentindex] = dto;
		this.currentindex++;
		return false;
	}

}

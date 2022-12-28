package com.xworkz.examples.constant.repository;

import com.xworkz.examples.constant.dto.TheaterDTO;
import com.xworkz.examples.exception.StorageFullException;

public class TheaterRepositoryImpl implements TheaterRepository {

	private TheaterDTO[] dtos = new TheaterDTO[5];
	private int presentindex = 0;

	@Override
	public boolean save(TheaterDTO dto) throws StorageFullException{
		System.out.println("running create of TheaterDTO" + dto);
		if (this.presentindex >= this.dtos.length) {
			System.err.println("arry size is exceeded");
			throw new StorageFullException("storage is full");
		}
		this.dtos[this.presentindex] = dto;
		this.presentindex++;
		return true;
	}

}

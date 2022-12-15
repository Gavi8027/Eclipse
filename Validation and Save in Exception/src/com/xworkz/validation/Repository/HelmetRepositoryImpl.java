package com.xworkz.validation.Repository;

import com.xworkz.validation.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {

	private HelmetDTO[] dtos = new HelmetDTO[10];
	private int index = 0;

	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("running create of HelmetDTO+ dto ");
		if (this.index >= this.dtos.length) {
			System.out.println("Arry size exceeded");
			return false;
		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;

	}
}

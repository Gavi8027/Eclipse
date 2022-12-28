package com.xworkz.examples.constant.repository;

import com.xworkz.examples.constant.dto.AbstractAuditDTO;
import com.xworkz.examples.constant.dto.BakeryDTO;

public class BakeryRepositoryImpl implements BakeryRepository {

	private BakeryDTO[] dtos = new BakeryDTO[4];
	private int index = 0;

	@Override
	public boolean save(BakeryDTO dto) throws ArrayStoreException{
		System.out.println("running save AbstractAuditDTO" + dto);
		if (this.index >= this.dtos.length) {
			System.out.println("arry size is exceeded");
		}

		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}

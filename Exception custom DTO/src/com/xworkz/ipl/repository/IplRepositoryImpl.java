package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public class IplRepositoryImpl implements IplRepository {
	
	private IplDTO[] iplDtos=new IplDTO[10];
	private int currentindex=0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("Running create of IplDTO" + dto);
		if(this.currentindex >=this.iplDtos.length) {
			System.err.println("size exceeded");
			throw new IplTeamSizeExceedException();
		
	}
		this.iplDtos[this.currentindex]= dto;
		this.currentindex++;
		return true;
	}
	
	@Override
	public int total() {
		System.out.println("Running total");
		return this.currentindex;
	}
}

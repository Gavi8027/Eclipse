package com.xworkz.soldier.repository;

import com.xworkz.soldier.dto.SoldiersDTO;

public class SoldiersRepoImpl implements SoldiersRepo {

	public SoldiersRepoImpl() {
		System.out.println("created SoldiersRepoImpl using no arg constractor");
	}

	@Override
	public boolean save(SoldiersDTO dto) {
		System.out.println("Running save method...");
		System.out.println("Dto " + dto);

		return false;

	}

}

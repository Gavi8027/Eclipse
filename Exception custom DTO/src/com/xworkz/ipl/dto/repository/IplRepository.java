package com.xworkz.ipl.dto.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {

	boolean create(IplDTO dto);
	default int total() {
		return 0;
	}
}

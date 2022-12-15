package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {

	boolean fight(WarDTO dto);

	boolean fight(WarDTO[] dtos);

	default int total() {
		return 0;
	}

	 default WarDTO findBystartBy(String startBy){
		return null;
	}


}

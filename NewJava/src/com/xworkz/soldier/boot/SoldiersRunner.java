package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldiersDTO;
import com.xworkz.soldier.service.SolderieServiceImpl;

public class SoldiersRunner {

	public static void main(String[] args) {

		SoldiersDTO dto = new SoldiersDTO("Ram", 172, "TopRank", "Major", "India");

		SolderieServiceImpl service = new SolderieServiceImpl();

		service.validateAndSave(dto);

	}

}

package com.xworkz.validation.boot;

import java.time.LocalDateTime;

import com.xworkz.validation.Repository.HelmetRepository;
import com.xworkz.validation.Repository.HelmetRepositoryImpl;
import com.xworkz.validation.constant.Color;
import com.xworkz.validation.constant.Helmetype;
import com.xworkz.validation.dto.HelmetDTO;
import com.xworkz.validation.service.HelmetService;
import com.xworkz.validation.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetDTO helmetdto = new HelmetDTO();
		helmetdto.setBrand("Cave");
		helmetdto.setColor(Color.BLACK);
		helmetdto.setPrice(800);
		helmetdto.setType(Helmetype.MILATARY);
		helmetdto.setCreatedBy("Gavi");
		helmetdto.setCreatedDate(LocalDateTime.now());
		helmetdto.setUpdatedBy("System");
		helmetdto.setUpdatedDate(LocalDateTime.now());

		HelmetRepository helmetRepository = new HelmetRepositoryImpl();

		HelmetService helmetService = new HelmetServiceImpl(helmetRepository);

		boolean save = helmetService.validateAndSave(helmetdto);

		System.out.println(save);

	}

}

package com.xworkz.examples.constant.boot;

import java.time.LocalDateTime;
import java.util.zip.DataFormatException;

import com.xworkz.examples.constant.dto.BakeryDTO;
import com.xworkz.examples.constant.repository.BakeryRepository;
import com.xworkz.examples.constant.repository.BakeryRepositoryImpl;
import com.xworkz.examples.constant.service.BakeryService;
import com.xworkz.examples.constant.service.BakeryServiceImpl;
import com.xworkz.examples.exception.InvalidTheaterDataException;

public class BakeryRunner {

	public static void main(String[] args) throws ArrayStoreException, DataFormatException {
		
		BakeryDTO bakeryDTO=new BakeryDTO();
		bakeryDTO.setName("Iynger");
		bakeryDTO.setLocation("Koppal");
		bakeryDTO.setOwner("ramesh");
		bakeryDTO.setFamousFor("Pedha");
		bakeryDTO.setContact(9916763682d);
		bakeryDTO.setCreatedBy("Gavi");
		bakeryDTO.setCreatedDate(LocalDateTime.now());
		bakeryDTO.setUpdatedBy("system");
		bakeryDTO.setUpdateddate(LocalDateTime.now());
		
		BakeryDTO bakeryDTO1=new BakeryDTO();
		bakeryDTO1.setName("Iynger");
		bakeryDTO1.setLocation("Koppal");
		bakeryDTO1.setOwner("ramesh");
		bakeryDTO1.setFamousFor("Pedha");
		bakeryDTO1.setContact(9916763682d);
		bakeryDTO1.setCreatedBy("Gavi");
		bakeryDTO1.setCreatedDate(LocalDateTime.now());
		bakeryDTO1.setUpdatedBy("system");
		bakeryDTO1.setUpdateddate(LocalDateTime.now());
		
		BakeryDTO bakeryDTO3=new BakeryDTO();
		bakeryDTO3.setName("Iynger");
		bakeryDTO3.setLocation("Koppal");
		bakeryDTO3.setOwner("ramesh");
		bakeryDTO3.setFamousFor("Pedha");
		bakeryDTO3.setContact(9916763682d);
		bakeryDTO3.setCreatedBy("Gavi");
		bakeryDTO3.setCreatedDate(LocalDateTime.now());
		bakeryDTO3.setUpdatedBy("system");
		bakeryDTO3.setUpdateddate(LocalDateTime.now());
		
		BakeryDTO bakeryDTO2=new BakeryDTO();
		bakeryDTO2.setName("Iynger");
		bakeryDTO2.setLocation("Koppal");
		bakeryDTO2.setOwner("ramesh");
		bakeryDTO2.setFamousFor("Pedha");
		bakeryDTO2.setContact(9916763682d);
		bakeryDTO2.setCreatedBy("Gavi");
		bakeryDTO2.setCreatedDate(LocalDateTime.now());
		bakeryDTO2.setUpdatedBy("system");
		bakeryDTO2.setUpdateddate(LocalDateTime.now());
		BakeryRepository bakeryRepository=new BakeryRepositoryImpl();
		
		BakeryDTO bakeryDTO4=new BakeryDTO();
		bakeryDTO4.setName("Iynger");
		bakeryDTO4.setLocation("Koppal");
		bakeryDTO4.setOwner("ramesh");
		bakeryDTO4.setFamousFor("Pedha");
		bakeryDTO4.setContact(9916763682d);
		bakeryDTO4.setCreatedBy("Gavi");
		bakeryDTO4.setCreatedDate(LocalDateTime.now());
		bakeryDTO4.setUpdatedBy("system");
		bakeryDTO4.setUpdateddate(LocalDateTime.now());
		
		
		
		//BakeryRepository bakeryRepository=new BakeryRepositoryImpl();
		BakeryService bakeryService=new BakeryServiceImpl(bakeryRepository);
		try {
			System.out.println("");
			bakeryService.validateAndSave(bakeryDTO);
			System.out.println("");
			bakeryService.validateAndSave(bakeryDTO1);
			System.out.println("");
			bakeryService.validateAndSave(bakeryDTO2);
			System.out.println("");
			bakeryService.validateAndSave(bakeryDTO4);
			System.out.println("");
			bakeryService.validateAndSave(bakeryDTO3);
			
		} 
		catch (DataFormatException e) {
		}
		
		

	}

}

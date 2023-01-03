package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.DataBaseVendorDTO;

public class DataBaseVendorRunner {

	public static void main(String[] args) {

		Collection<DataBaseVendorDTO> dataBaseVendorDTO=new ArrayList<DataBaseVendorDTO>();
		dataBaseVendorDTO.add(new DataBaseVendorDTO("Oracle RDBMS", "MySQL", 595, 47500));
		
		dataBaseVendorDTO.add(new DataBaseVendorDTO("Apple", "Claris", 8, 67850));
		
		dataBaseVendorDTO.add(new DataBaseVendorDTO("SAPS", "Bob Epstein", 10000, 42800));
		
		
		dataBaseVendorDTO
		.stream().filter(dto -> dto.getLicenseCost()< 100)
		//.map(dto -> dto.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		
		
		
		dataBaseVendorDTO
		.stream()
		.filter(dto -> dto.getLicenseCost()< 100)
		//.map(dto -> dto.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach (dto-> System.out.println(dto.getSize()));
		
		System.out.println(" ");
		System.out.println("Printing vendor types");
		dataBaseVendorDTO
		.stream()
		//.filter(dto -> dto.getType())
		//.map(dto -> dto.getDevelopedBy().toUpperCase())
		//.collect(Collectors.toList())
		.forEach (dto-> System.out.println(dto.getLicenseCost()));


	}

}

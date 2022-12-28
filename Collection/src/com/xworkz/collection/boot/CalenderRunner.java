package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.Airport;
import com.xworkz.collection.dto.CalenderDTO;

public class CalenderRunner {

	public static void main(String[] args) {

		
		CalenderDTO calenderDTO1=new CalenderDTO("ShabadhiMatha","yearly",12);
		
		CalenderDTO calenderDTO2=new CalenderDTO("ShabadhiMatha","yearly",12);
		
		CalenderDTO calenderDTO3=new CalenderDTO("Panchanga","weekly",7);
		
		CalenderDTO calenderDTO4=new CalenderDTO("Dinadarhike","yearly",12);
		
		CalenderDTO calenderDTO5=new CalenderDTO("ShabadhiMatha","yearly",12);
		
		boolean equals=calenderDTO1.equals(calenderDTO2);
		System.out.println(calenderDTO1.getName().equals(calenderDTO2.getName()));
		
		Collection<CalenderDTO> calender=new ArrayList<CalenderDTO>();
		calender.add(calenderDTO1);
		
		
		boolean contains=calender.contains(calenderDTO1);
		System.out.println("contains "+contains);





		
		
	}

}

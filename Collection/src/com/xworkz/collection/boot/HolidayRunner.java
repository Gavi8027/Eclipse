package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.CalenderDTO;
import com.xworkz.collection.dto.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {

		
		HolidayDTO holidayDTO1=new HolidayDTO("Weekend",1,true);
		
		HolidayDTO holidayDTO2=new HolidayDTO("Weekend",1,true);
		
		HolidayDTO holidayDTO3=new HolidayDTO("Weekend",1,true);
		
		HolidayDTO holidayDTO4=new HolidayDTO("Weekend",1,true);
		
		HolidayDTO holidayDTO5=new HolidayDTO("Weekend",1,true);
		
		boolean equals=holidayDTO1.equals(holidayDTO2);
		System.out.println(holidayDTO1.getType().equals(holidayDTO2.getType()));
		
		Collection<HolidayDTO> calender=new ArrayList<HolidayDTO>();
		calender.add(holidayDTO1);
		
		
		boolean contains=calender.contains(holidayDTO1);
		System.out.println("contains "+contains);






	}

}

package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.Airport;
import com.xworkz.collection.dto.GameDTO;

public class AirportRunner {

	public static void main(String[] args) {

		
		Airport airportDTO1=new Airport("Kempegowda","International",120);
		Airport airportDTO2=new Airport("Kempegowda","International",120);
		Airport airportDTO3=new Airport("Kempegowda","International",120);
		Airport airportDTO4=new Airport("Kempegowda","International",120);
		Airport airportDTO5=new Airport("Kempegowda","International",120);
		
		
		boolean equals=airportDTO1.equals(airportDTO2);
		System.out.println(airportDTO1.getName().equals(airportDTO2.getName()));
		
		Collection<Airport> airport=new ArrayList<Airport>();
		airport.add(airportDTO2);
		
		
		boolean contains=airport.contains(airportDTO2);
		System.out.println("contains "+contains);

		
		
	}

}

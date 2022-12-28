package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.CalenderDTO;
import com.xworkz.collection.dto.Place;

public class PlaceRunner {

	public static void main(String[] args) {

		

		
		Place place1=new Place("Davanageri","Benne Dose",7);
		Place place2=new Place("Davanageri","Benne Dose",7);
        Place place3=new Place("Davanageri","Benne Dose",7);
        Place place4=new Place("Davanageri","Benne Dose",7);
		Place place5=new Place("Davanageri","Benne Dose",7);
		
		
		boolean equals=place1.equals(place2);
		System.out.println(place1.getName().equals(place1.getName()));
		
		Collection<Place> calender=new ArrayList<Place>();
		calender.add(place1);
		
		
		boolean contains=calender.contains(place1);
		System.out.println("contains "+contains);


		
		

		
	}

}

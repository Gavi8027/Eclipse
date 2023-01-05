package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.MovieDTO;

import sun.util.resources.LocaleData;

public class MovieRunner {

	public static void main(String[] args) {


		
		Collection<MovieDTO> movies=new ArrayList<MovieDTO>();
		
		movies.add(new MovieDTO("Kantara",200,"13/12/2021","Kannada",true));
		
		movies.add(new MovieDTO("Kranti",150,"26/1/2023","Kannada",true));
		
		movies.add(new MovieDTO("RRR",300,"19/12/2022","Telugu",false));
		
		


		movies.stream().sorted().collect(Collectors.toSet()).forEach(ref->System.out.println(ref));
	}

}

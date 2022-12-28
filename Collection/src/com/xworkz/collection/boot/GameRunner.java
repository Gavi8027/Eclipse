package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.GameDTO;

public class GameRunner {

	public static void main(String[] args) {


		
		GameDTO gamedto1=new GameDTO("kabbaddi","Indoor",7);
		
		GameDTO gamedto2=new GameDTO("kabbaddi","Indoor",7);

		
		GameDTO gamedto3=new GameDTO("Kho kho","Indoor",7);
		GameDTO gamedto4=new GameDTO("kabbaddi","Indoor",7);

		GameDTO gamedto5=new GameDTO("kabbaddi","Indoor",7);
		
		boolean equals=gamedto1.equals(gamedto2);
		System.out.println(gamedto1.getName().equals(gamedto2.getName()));
		
		Collection<GameDTO> game=new ArrayList<GameDTO>();
		game.add(gamedto2);
		
		
		boolean contains=game.contains(gamedto2);
		System.out.println("contains "+contains);

		
		

		
		
		


	}

}

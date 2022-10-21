package com.xworkz.things.boot;

import com.xworkz.things.Statue;

public class StatueRunner {

	public static void main(String[] args) {
		
		
		String[] color= {"red","grey","silver","brown","white","black"};
		String[] person= {"APJ","GANDHIJI","CHENNAMMA","DR.RAJKUMAR","PUNEETRAJKUMAR","KEMPEGWODA"};
		
		
		Statue statue =new Statue(true,5.8,color,person,6);
		statue.Display();
		
		
		

	}

}